//AthonticationServlet.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;

@WebServlet("/AthonticationServlet")

public class PR_22_2_AthonticationServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String pass="abhishek12345";
		String username, password;
		username = request.getParameter("username");
		password = request.getParameter("password");
		if (username.equals(uname) && password.equals(pass)) {
			out.println("Login Successfull");
		} else {
			out.println("Login Unsuccessfull");
		}
	}
}
