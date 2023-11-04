import java.io.IOException;
import java.util.Date;
import java.net.*;

public class PR_15_3_URLConnectionInfoRetriever
{
	public static void main(String[] args)
	{
		try {
			String urlString = "https://www.example.com";
			URLConnection connection = new URL(urlString).openConnection();

			long date = connection.getDate();
			System.out.println("Date: " + (date != 0 ? new Date(date) : "Not available"));

			System.out.println("Content Type: " + connection.getContentType());
			long contentLength = connection.getContentLengthLong();
			System.out.println("Content Length: " + (contentLength != -1 ? contentLength + " bytes" : "Not available"));
		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
	}
}
