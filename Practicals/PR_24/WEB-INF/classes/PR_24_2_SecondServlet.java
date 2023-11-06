// SecondServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet2")

public class PR_24_2_SecondServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			Cookie ck[] = request.getCookies();
			out.print("Hello " + ck[0].getValue());
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
