import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/PostParametersServlet")

public class PR_21_2_PostParametersServlet extends GenericServlet
{
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw = response.getWriter();
		// Get Enumeration of parameter names.
		Enumeration e = request.getParameterNames();
		// Display parameter names and values.
		while (e.hasMoreElements()) {
			String pname = (String)e.nextElement();
			pw.print(pname + " = ");
			String pvalue = request.getParameter(pname);
			pw.println(pvalue);
		}
		pw.close();
	}
}
