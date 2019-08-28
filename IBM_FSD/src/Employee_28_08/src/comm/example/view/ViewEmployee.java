package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.controller.EmployeeDaoImpl;
import comm.example.factory.MyConnectionFactory;
import comm.example.model.Employee;

/**
 * Servlet implementation class ViewEmployee
 */
@WebServlet("/ViewEmployee.view")
public class ViewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		PrintWriter pw = response.getWriter();
		Employee e=new Employee();
		EmployeeDaoImpl emp=new EmployeeDaoImpl();
		Connection connection=MyConnectionFactory.getMySqlConnectionFormMydb();
		Statement statement = connection.createStatement();
		ArrayList<Employee> list= emp.viewEmployee(e);
		pw.print("<table><tr><td>NAME</td><td>PASSWORD</td><td>EMAIL</td><td>COUNTRY</td></tr>");
		for(int i=0;i<list.size();i++){
		    
			pw.println("<tr><td>"+list.get(i).getName()+"</td>");
			pw.println("<td>"+list.get(i).getPassword()+"</td>");
			pw.println("<td>"+list.get(i).getEmail()+"</td>");
			pw.println("<td>"+list.get(i).getCountry()+"</td>");
			pw.println("<td><a href=''>Edit</a></td>");
			pw.println("<td><a href=''>Delete</a></td></tr>");
			
		}

		pw.print("</table>");
}
}
