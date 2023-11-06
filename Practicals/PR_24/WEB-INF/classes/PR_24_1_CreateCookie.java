import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CreateCookie")

public class PR_24_1_CreateCookie extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		Cookie cookie = new Cookie("testCookie", "hellothisismycookie");
		cookie.setMaxAge(600);
		response.addCookie(cookie);
		response.setContentType("text/html");
		response.getWriter().println("Cookie 'testCookie' has been created with a 10-minute expiration time.");
	}
}
