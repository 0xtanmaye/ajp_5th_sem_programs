import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CollectUserInfo")

public class PR_24_3_CollectUserInfo extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String userName = req.getParameter("userName");
		String userEmail = req.getParameter("userEmail");

		Cookie nameCookie = new Cookie("userName", userName);
		Cookie emailCookie = new Cookie("userEmail", userEmail);

		nameCookie.setMaxAge(24 * 60 * 60);
		emailCookie.setMaxAge(24 * 60 * 60);

		res.addCookie(nameCookie);
		res.addCookie(emailCookie);

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>User Information Collected</title></head><body>");
		out.println("<h2>User Information</h2>");
		out.println("<p>Thank you, " + userName + "!</p>");
		out.println("<p>Your name and email have been saved in cookies.</p>");
		out.println("<a href='./DisplayUserInfo'>Display User Info</a>");
		out.println("</body></html>");
		out.close();
	}
}
