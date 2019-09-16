package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.controller.EmployeeDaoImpl;
import comm.example.model.Employee;

/**
 * Servlet implementation class EditEmployee
 */
@WebServlet("/EditEmployee.view")
public class EditEmployee extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    public String email;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		email=request.getParameter("id");
		EmployeeDaoImpl emp=new EmployeeDaoImpl();
		//System.out.println(email);
		ArrayList<Employee> list=emp.editEmployee(email);
		PrintWriter out = response.getWriter();
		for(Employee e:list) {
			out.println("<form action='EditEmployeeController.view' method='post'>");
			out.println("Name:<input type='text' name='name' value='"+e.getName()+"'/><br/>" );
			out.println("Password:<input type='text' name='password' value='"+e.getPassword()+"'/><br/>" );
			out.println("Email:<input type='text' name='email' value='"+e.getEmail()+"'/><br/>" );
			out.println("Country:<select name=\"country\">\r\n" + 
						"<option value=\"unknown\">Select...</option>\r\n" + 
						"<option value=\"India\">India</option>\r\n" + 
						"<option value=\"US\">US</option>\r\n" + 
						"<option value=\"UK\">UK</option>\r\n" + 
						"<option value=\"other\">Other</option></select><br />\r\n");
			out.println("<input type='submit' value='EDIT AND SAVE'<br /></form>");
		
		}
		
}
}
