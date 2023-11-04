import java.net.*;
import java.io.*;

public class PR_16_3_PrimeCheckerServer
{
	public static void main(String[] args)
	{
		int port = 26262;
		if (args.length == 1) {
			port = Integer.parseInt(args[0]);
		}

		try (ServerSocket serverSocket = new ServerSocket(port)) {
			System.out.println("Prime Checker Server is running on port " + port + "...");

			while (true) {
				Socket clientSocket = serverSocket.accept();
				if (clientSocket.isConnected())
					System.out.println("Client: " + clientSocket.getRemoteSocketAddress() + " successfully connected");
				
				BufferedReader clientIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				PrintWriter clientOut = new PrintWriter(clientSocket.getOutputStream(), true);
				
				String clientMessage;
				while ((clientMessage = clientIn.readLine()) != null) {
					int number = 0;
					try {
						number = Integer.parseInt(clientMessage);
					} catch (NumberFormatException nfe) {
						clientOut.println("Invalid input. Please send a number");
						continue;
					}
					int count = 0;
					for (int i = 1; i <= (number / 2); ++i)
						if (number % i == 0)
							++count;
					if (count == 1)
						clientOut.println("Prime");
					else
						clientOut.println("Not Prime");
				}
				clientIn.close();
				clientOut.close();
				clientSocket.close();
				System.out.println("Client: " + clientSocket.getRemoteSocketAddress() + " successfully disconnected");
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
