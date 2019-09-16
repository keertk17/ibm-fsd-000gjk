package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorServelet
 */
@WebServlet("/error.view")
public class ErrorServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object add_league;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		@SuppressWarnings("unchecked")
		List<String> err=(List<String>)request.getAttribute("ERROR");
		for(String s:err)
		{
			out.println("<p style=\"color:Red;\">"+s+"</p><br/>");
		}
		
		out.println("<input type=\"submit\" value=\"Back\" id=\"button-1\" onclick=\"document.location.href='add_league.html';\"/>");
	}
	
	
}

