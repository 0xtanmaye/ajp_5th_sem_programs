import java.net.*;
import java.io.*;

public class PR_17_2_DatagramChat
{
	static InetAddress remoteAddress = null;
	static int remotePort = -1;
	public static void main(String[] args) throws Exception
	{
		int port = -1;
		if (args.length == 1) {
			port = Integer.parseInt(args[0]);
		} else if (args.length == 2) {
			remoteAddress = InetAddress.getByName(args[0]);
			remotePort = Integer.parseInt(args[1]);
		} else if (args.length == 3) {
			port = Integer.parseInt(args[0]);
			remoteAddress = InetAddress.getByName(args[1]);
			remotePort = Integer.parseInt(args[2]);
		}

		try (
				DatagramSocket listenSocket = (port == -1 ? new DatagramSocket() : new DatagramSocket(port));
				BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in))
		) {
			if (port == -1)
				port = listenSocket.getLocalPort();
			
			if (remoteAddress == null)
				System.out.println("Listening on port " + port + "...");
			else
				System.out.println("Listening on port " + port + " and sending messages to " + remoteAddress + " on port " + remotePort);

			Thread receiveThread = new Thread() {
				@Override
				public void run() {
					try {
						byte[] receiveData = new byte[1024];
						while (!listenSocket.isClosed()) {
							DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
							listenSocket.receive(receivePacket);
							if (remoteAddress == null || remotePort == -1) {
								remoteAddress = receivePacket.getAddress();
								remotePort = receivePacket.getPort();
							}

							String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());	
							if (clientMessage.equals("exit")) {
								System.out.println("User (" + remoteAddress + ":" + remotePort + " ended conversation\n");
								remoteAddress = null;
								remotePort = -1;
								continue;
							}
							System.out.println("User (" + remoteAddress + ":" + remotePort + "): " + clientMessage);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			};
			receiveThread.start();

			while (true) {
				String serverMessage = consoleInput.readLine();
				byte[] sendData = serverMessage.getBytes();
				if (remoteAddress != null && remotePort != -1) {
					DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, remoteAddress, remotePort);
					listenSocket.send(sendPacket);
				} else {
					System.err.println("No one to send messages yet");
					continue;
				}
				if (serverMessage.equals("exit")) {
					break;
				}
				System.out.println("You: " + serverMessage);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
