package comm.example.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.Employee;

/**
 * Servlet implementation class DeleteEmployeeeController
 */
@WebServlet("/DeleteEmployeeController.view")
public class DeleteEmployeeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String name,password,email,country;
    
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
		String email = request.getParameter("id");
		EmployeeDaoImpl emp=new EmployeeDaoImpl();
		emp.deleteEmployee(email);
		RequestDispatcher  view=request.getRequestDispatcher("ViewEmployee.view");
		view.forward(request, response);
}
}
