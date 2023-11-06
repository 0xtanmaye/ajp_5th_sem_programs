import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/GetBrowserInfo")

public class PR_24_4_GetBrowserInfo extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");

		String userAgent = req.getHeader("User-Agent");

		PrintWriter out = res.getWriter();
		out.println("<html><head><title>Browser Information</title></head><body>");
		out.println("<h2>Browser Information</h2>");
		out.println("<p>User-Agent: " + userAgent + "</p>");
		out.println("</body></html>");
		out.close();
	}
}
