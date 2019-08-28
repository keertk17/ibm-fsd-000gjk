package comm.example.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.controller.EmployeeDaoImpl;
import comm.example.factory.MyConnectionFactory;
import comm.example.model.Employee;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee.view")
public class AddEmployee extends HttpServlet {
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
		name=request.getParameter("name");
		password=request.getParameter("password");
		email=request.getParameter("email");
		country=request.getParameter("country");
		Employee e=new Employee(name, password, email,country);
		request.setAttribute("SUCCESS", e);
		EmployeeDaoImpl emp=new EmployeeDaoImpl();
		emp.createEmployee(e);
		RequestDispatcher  view=request.getRequestDispatcher("AddEmployee.do");
		view.forward(request, response);
		/*Connection connection=MyConnectionFactory.getMySqlConnectionFormMydb();
		PreparedStatement pst=connection.prepareStatement("insert into employee(name,password,email,country) values(?,?,?,?)");
		pst.setString(1, name);
		pst.setString(2, password);
		pst.setString(3, email);
		pst.setString(4, country);
		pst.executeUpdate();*/
	}
	}