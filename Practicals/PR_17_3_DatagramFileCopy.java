import java.io.*;
import java.net.*;

public class PR_17_3_DatagramFileCopy
{
	public static void main(String[] args)
	{
		if (args.length == 3) {
			String sourceFileName = args[0];
			String destinationHost = args[1];
			int destinationPort = Integer.parseInt(args[2]);
			sendFile(sourceFileName, destinationHost, destinationPort);
		} else if (args.length == 2) {
			int listenPort = Integer.parseInt(args[0]);
			String outputFileName = args[1];
			receiveFile(outputFileName, listenPort);
		} else {
			System.out.println("Usage for sender: java PR_17_3_DatagramFileCopy <sourceFile> <remoteAddress> <remotePort>");
			System.out.println("Usage for receiver: java PR_17_3_DatagramFileCopy <listenPort> <receivedFileName>");
		}
	}
	
	static void sendFile(String sourceFileName, String destinationHost, int destinationPort)
	{
		try (
			FileInputStream fileInputStream = new FileInputStream(sourceFileName);
			DatagramSocket datagramSocket = new DatagramSocket()
		) {
			InetAddress destinationAddress = InetAddress.getByName(destinationHost);
			byte[] buffer = new byte[1024];
			int bytesRead;

			while ((bytesRead = fileInputStream.read(buffer)) != -1) {
				DatagramPacket packet = new DatagramPacket(buffer, bytesRead, destinationAddress, destinationPort);
				datagramSocket.send(packet);
			}

			DatagramPacket endOfFilePacket = new DatagramPacket(buffer, 0, destinationAddress, destinationPort);
			datagramSocket.send(endOfFilePacket);

			System.out.println("File sent successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void receiveFile(String outputFileName, int listenPort)
	{
		try (
			FileOutputStream fileOutputStream = new FileOutputStream(outputFileName);
			DatagramSocket datagramSocket = new DatagramSocket(listenPort)
		) {
			byte[] buffer = new byte[1024];
			DatagramPacket packet;

			while (true) {
				packet = new DatagramPacket(buffer, buffer.length);
				datagramSocket.receive(packet);

				if (packet.getLength() == 0) {
					break;
				}

				fileOutputStream.write(packet.getData(), 0, packet.getLength());
			}
			System.out.println("File received and saved as " + outputFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
