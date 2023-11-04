import java.io.*;
import java.net.*;

public class PR_16_2_ChatServer
{
	public static void main(String[] args)
	{
		int port = 6969;
		if (args.length == 1) {	
			port = Integer.parseInt(args[0]);
		}

		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("Chat Server is running on port " + port + "...");

			Socket clientSocket = serverSocket.accept();
			if (clientSocket.isConnected())
				System.out.println("Client: " + clientSocket.getRemoteSocketAddress() + " successfully connected");

			BufferedReader clientIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter clientOut = new PrintWriter(clientSocket.getOutputStream(), true);

			BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

			String clientMessage;
			String serverMessage;

			while (true) {
				if (clientIn.ready()) {
					clientMessage = clientIn.readLine();
					if (clientMessage == null || clientMessage.equals("exit")) {
						System.out.println("Client said Bye!");
						break;
					}
					System.out.println("Client: " + clientMessage);
				}

				if (consoleInput.ready()) {
					serverMessage = consoleInput.readLine();
					clientOut.println(serverMessage);
					if (serverMessage.equals("exit"))
						break;
					System.out.println("Server: " + serverMessage);
				}
			}
			clientIn.close();
			clientOut.close();
			clientSocket.close();
			serverSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
