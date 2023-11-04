import java.io.*;
import java.net.*;
import java.util.Scanner;

public class PR_16_1_AuthenticationServer
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the server port: ");
		int serverPort = Integer.parseInt(scanner.nextLine());

		try {
			ServerSocket server = new ServerSocket(serverPort);
			while (true) {
				Socket client = server.accept();
				System.out.println("Client connected: " + client.getInetAddress());
				BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter output = new PrintWriter(client.getOutputStream(), true);
				String userId = input.readLine(), password = input.readLine();
				if (authenticate(userId, password))
					output.println("Authentication successful. Welcome, " + userId + "!");
				else
					output.println("Authentication failed. Invalid user ID or password.");
				client.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static boolean authenticate(String userId, String password)
	{
		String validUserId = "user123", validPassword = "password123";
		return validUserId.equals(userId) && validPassword.equals(password);
	}
}
