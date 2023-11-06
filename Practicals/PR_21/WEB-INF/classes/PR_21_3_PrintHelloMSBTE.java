import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/PrintHelloMSBTE")

public class PR_21_3_PrintHelloMSBTE extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head><title>Print Hello MSBTE</title></head>");
		out.println("<body>");
		out.println("<h1>Hello MSBTE</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
