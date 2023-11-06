import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ExamResultServlet")

public class PR_22_4_ExamResultServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int subject1Marks = Integer.parseInt(req.getParameter("subject1"));
		int subject2Marks = Integer.parseInt(req.getParameter("subject2"));
		int subject3Marks = Integer.parseInt(req.getParameter("subject3"));

		boolean passed = (subject1Marks >= 40 && subject2Marks >= 40 && subject3Marks >= 40);

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		if (passed) {
			out.println("You have passed the examination.");
		} else {
			out.println("You have failed the examination.");
		}
		out.println("</body></html>");
		out.close();
	}
}
