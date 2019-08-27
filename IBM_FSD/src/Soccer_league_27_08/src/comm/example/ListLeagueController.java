package comm.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.factory.MyConnectionFactory;
import comm.example.model.League;

/**
 * Servlet implementation class ListLeagueController
 */
@WebServlet("/ListLeagueController.view")
public class ListLeagueController extends HttpServlet {
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
			Connection connection=MyConnectionFactory.getMySqlConnectionFormMydb();
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select title,year,season from league");
			while(rs.next()) {
				pw.println(rs.getString(1));
				pw.println(rs.getString(3));
				pw.println(rs.getInt(2));
			}
			
	}
	}