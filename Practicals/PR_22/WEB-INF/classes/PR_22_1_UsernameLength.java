import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/UsernameLength")

public class PR_22_1_UsernameLength extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String username = req.getParameter("username");
		out.println("The length of the username '" + username + "' is: " + username.length());
		out.close();
	}
}
