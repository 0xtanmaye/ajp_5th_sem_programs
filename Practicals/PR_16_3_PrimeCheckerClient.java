import java.io.*;
import java.net.*;

public class PR_16_3_PrimeCheckerClient
{
	public static void main(String[] args)
	{
		String serverAddress = "localhost";
		int port = 26262;
		if (args.length == 2) {
			serverAddress = args[0];
			port = Integer.parseInt(args[1]);
		}
		
		try (
				Socket clientSocket = new Socket(serverAddress, port);
				BufferedReader serverIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				PrintWriter serverOut = new PrintWriter(clientSocket.getOutputStream(), true);
				BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in))
		) {
			if (clientSocket.isConnected())
				System.out.println("Successfully connected to " + serverAddress + " on port " + port);
			String clientMessage;
			String serverMessage;
			
			while (true) {
				if (serverIn.ready()) {
					serverMessage = serverIn.readLine();
					System.out.println("Server's response: " + serverMessage);
				}
				
				if (consoleInput.ready()) {
					clientMessage = consoleInput.readLine();
					if (clientMessage.equals("exit"))
						break;
					int number = 0;
					try {
						number = Integer.parseInt(clientMessage);
					} catch (NumberFormatException nfe) {
						System.err.println("Please enter a valid number");
						continue;
					}
					serverOut.println(number);
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
