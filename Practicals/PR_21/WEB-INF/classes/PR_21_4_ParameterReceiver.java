import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/ParameterReceiver")

public class PR_21_4_ParameterReceiver extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("You sent parameter: " + req.getParameter("param"));
		out.close();
	}
}
