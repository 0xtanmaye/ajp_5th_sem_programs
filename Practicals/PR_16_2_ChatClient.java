import java.io.*;
import java.net.*;

public class PR_16_2_ChatClient
{
	public static void main(String[] args)
	{
		String serverAddress = "localhost";
		int port = 6969;
		if (args.length == 2) {	
			serverAddress = args[0];
			port = Integer.parseInt(args[1]);
		}

		try {
			Socket clientSocket = new Socket(serverAddress, port);
			if (clientSocket.isConnected())
				System.out.println("Successfully connected to " + serverAddress + " on port " + port);
			BufferedReader serverIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter serverOut = new PrintWriter(clientSocket.getOutputStream(), true);

			BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

			String clientMessage;
			String serverMessage;

			while (true) {
				if (serverIn.ready()) {
					serverMessage = serverIn.readLine();
					if (serverMessage == null || serverMessage.equals("exit")) {
						System.out.println("Server said Bye!");
						break;
					}
					System.out.println("Server: " + serverMessage);
				}

				if (consoleInput.ready()) {
					clientMessage = consoleInput.readLine();
					serverOut.println(clientMessage);
					if (clientMessage.equals("exit"))
						break;
					System.out.println("Client: " + clientMessage);
				}
			}

			serverIn.close();
			serverOut.close();
			clientSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
