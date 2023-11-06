import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/DisplayUserInfo")

public class PR_24_3_DisplayUserInfo extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>User Information Display</title></head><body>");
		out.println("<h2>User Information Display</h2>");

		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies)
				out.println("<p>" + cookie.getName() + " = " + cookie.getValue() + "</p>");
		}
		out.println("</body></html>");
		out.close();
	}
}
