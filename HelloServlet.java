import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/sayhello")
public class HelloServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		
		PrintWriter responseWriter = response.getWriter();
		
		responseWriter.println("<!DOCTYPE html>");
		responseWriter.println("<html>");
		responseWriter.println("<head><title>Hello, World</title></head>");
		responseWriter.println("<body>");
		responseWriter.println("<h1>Hello, world!</h1>");
		responseWriter.println("<p>Request URI: " + request.getRequestURI() + "</p>");
		responseWriter.println("<p>Protocol: " + request.getProtocol() + "</p>");
		responseWriter.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
		responseWriter.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");
		responseWriter.println("<p>A Random Number: <strong>" + Math.random() + "</strong></p>");
		responseWriter.println("</body></html>");
		responseWriter.close();
	}
}