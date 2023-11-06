import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/HelloMSBTE")

public class PR_21_1_HelloMSBTE extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head><title>Hello MSBTE!</title></head>");
		out.println("<body>");
		out.println("<h1>Welome to Maharashtra State Board Of Technical Education !</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
