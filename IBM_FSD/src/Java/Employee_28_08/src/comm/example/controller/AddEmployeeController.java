package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployeeController
 */
@WebServlet("/AddEmployee.do")
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		out.println("\r\n" + 
				"<h2><b>Add Employee</b></h2><form id=\"form-1\" action=\"AddEmployee.view\" method=\"post\">\r\n" + 
				"<label for=\"input-1\">Name</label>\r\n" + 
				"<input id=\"input-1\" name=\"name\"  required=\"true\" type=\"text\"/><br />\r\n" + 
				"<label for=\"input-2\">Password</label>\r\n" + 
				"<input id=\"input-2\" name=\"password\"  required=\"true\" type=\"text\"/><br />\r\n" + 
				"<label for=\"input-3\">Email</label>\r\n" + 
				"<input id=\"input-3\" name=\"email\"  required=\"true\" type=\"text\"/><br />\r\n" + 
				"<label for=\"input-4\">Country</label>\r\n" + 
				"<select name=\"country\">\r\n" + 
				"<option value=\"unknown\">Select...</option>\r\n" + 
				"<option value=\"India\">India</option>\r\n" + 
				"<option value=\"US\">US</option>\r\n" + 
				"<option value=\"UK\">UK</option>\r\n" + 
				"<option value=\"other\">Other</option></select><br />\r\n" + 
				"<input type=\"submit\" value=\"ADD EMPLOYEE\" id=\"button-1\"/><br />\r\n" + 
				"</form>\r\n" + 
				"<a href=\"ViewEmployee.view\">ViewEmployee</a><br />\r\n");
				
	}
	}