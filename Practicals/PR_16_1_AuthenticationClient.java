import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class PR_16_1_AuthenticationClient
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the server address: ");
		String serverAddress = scanner.nextLine();

		System.out.print("Enter the server port: ");
		int serverPort = Integer.parseInt(scanner.nextLine());

		System.out.print("Enter the user ID: ");
		String userId = scanner.nextLine();

		System.out.print("Enter the password: ");
		String password = scanner.nextLine();

		try {
			Socket socket = new Socket(serverAddress, serverPort);
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out.println(userId);
			out.println(password);
			String response = in.readLine();
			System.out.println("Server response: " + response);
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
