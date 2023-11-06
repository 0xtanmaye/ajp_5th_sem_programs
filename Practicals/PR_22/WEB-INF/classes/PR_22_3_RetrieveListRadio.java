import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/RetrieveListRadio")

public class PR_22_3_RetrieveListRadio extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String listItem = req.getParameter("list");
		String radioItem = req.getParameter("radiobtn");

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("Selected item from the list: " + listItem + "<br>");
		out.println("Selected radio button: " + radioItem);
		out.println("</body></html>");
		out.close();
	}
}
