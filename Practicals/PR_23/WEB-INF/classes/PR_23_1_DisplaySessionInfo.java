import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/DisplaySessionInfo")

public class PR_23_1_DisplaySessionInfo extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		HttpSession session = req.getSession();
		String sessionId = session.getId();
		long creationTime = session.getCreationTime();
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>Session Information</title></head><body>");
		out.println("<h2>Session Information</h2>");
		out.println("<p>Session ID: " + sessionId + "</p>");
		out.println("<p>Session Creation Time: " + new java.util.Date(creationTime) + "</p>");
		out.println("</body></html>");
		out.close();
	}
}
