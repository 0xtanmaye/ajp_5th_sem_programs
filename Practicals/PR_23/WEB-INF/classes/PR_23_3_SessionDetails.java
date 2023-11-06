import java.io.*;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SessionDetails")

public class PR_23_3_SessionDetails extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		HttpSession session = req.getSession();

		out.println("<html><head><title>Session Details</title></head><body>");
		out.println("<h2>Session Details</h2>");
		out.println("<p>Session ID: " + session.getId() + "</p>");
		out.println("<p>Session Creation Time: " + new java.util.Date(session.getCreationTime()) + "</p>");
		out.println("<p>Last Accessed Time: " + new java.util.Date(session.getLastAccessedTime()) + "</p>");
		out.println("<p>Max Inactive Interval (seconds): " + session.getMaxInactiveInterval() + "</p>");
		out.println("<p>Is New Session: " + session.isNew() + "</p>");

		out.println("<h2>Session Attributes</h2>");
		Enumeration<String> attributeNames = session.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String attributeName = attributeNames.nextElement();
			Object attributeValue = session.getAttribute(attributeName);
			out.print("<p>Attribute Name: " + attributeName);
			out.println(" and Value: " + attributeValue + "</p>");
		}
		
		out.println("</body></html>");
		out.close();
	}
}
