import java.net.*;
import java.util.Scanner;

public class PR_14_2_IPAddressResolver
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hostname: ");
		String hostname = input.nextLine();

		try {
			InetAddress[] addresses = InetAddress.getAllByName(hostname);
			System.out.println("IP Address(es) for " + hostname + ":");
			for (InetAddress address: addresses)
				System.out.println(address.getHostAddress());
		} catch (UnknownHostException e) {
			System.err.println("Unable to resolve the IP address for the provided hostname.");
		}

		input.close();
	}
}
