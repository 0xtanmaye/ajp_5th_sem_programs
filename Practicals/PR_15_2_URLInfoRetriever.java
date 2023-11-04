import java.net.*;

public class PR_15_2_URLInfoRetriever
{
	public static void main(String[] args)
	{
		try {
			URL url = new URL("http://www.msbte.org.in");
			System.out.println("URL Information:");
			System.out.println("URL: " + url);
			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host: " + url.getHost());
			System.out.println("Port: " + (url.getPort() == -1 ? url.getDefaultPort() : url.getPort()));
			System.out.println("File: " + url.getFile());
		} catch (MalformedURLException e) {
			System.err.println("Malformed URL: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
	}
}
