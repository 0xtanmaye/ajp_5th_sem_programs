import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SessionExpire")

public class PR_23_4_SessionExpire extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		HttpSession session = req.getSession();

		session.setMaxInactiveInterval(120);

		out.println("<html><head><title>Session Details</title></head><body>");
		out.println("<h2>Session Details</h2>");
		out.println("<p>Last Accessed Time: " + new java.util.Date(session.getLastAccessedTime()) + "</p>");
		out.println("<p>Max Inactive Interval: " + session.getMaxInactiveInterval() + " seconds</p>");
		out.println("</body></html>");

		out.close();
	}
}
