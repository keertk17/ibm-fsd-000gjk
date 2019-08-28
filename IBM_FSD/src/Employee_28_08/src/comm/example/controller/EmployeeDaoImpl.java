package comm.example.controller;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import comm.example.factory.MyConnectionFactory;
import comm.example.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	

	@Override
	public void createEmployee(Employee employee) {
	try {
	
	Connection connection=MyConnectionFactory.getMySqlConnectionFormMydb();
	PreparedStatement pst=connection.prepareStatement("insert into employee(name,password,email,country) values(?,?,?,?)");
	pst.setString(1,employee.getName());
	pst.setString(2, employee.getPassword());
	pst.setString(3, employee.getEmail());
	pst.setString(4, employee.getCountry());
	pst.executeUpdate();		
		
	} catch (SQLException e) {
		System.out.println("duplicate id");
		
		e.printStackTrace();
	} 		
		
	}


	@Override
	public ArrayList<Employee> viewEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		
			ArrayList<Employee> list=new ArrayList<Employee>();
			Statement statement=null;
			ResultSet resultSet=null;
			try {
				Connection connection=MyConnectionFactory.getMySqlConnectionFormMydb();
				statement=connection.createStatement();
				resultSet=statement.executeQuery("select name,password,email,country from employee");
				ResultSetMetaData rMetaData= resultSet.getMetaData();
				rMetaData.getColumnLabel(1);
				while(resultSet.next())
				{
					list.add(new Employee( resultSet.getString(1),
							resultSet.getString(2), resultSet.getString(3),resultSet.getString(4)));
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return list;
		}


	@Override
	public ArrayList<Employee> editEmployee(String email) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		Statement statement=null;
		ResultSet resultSet=null;
		try {
			Connection connection=MyConnectionFactory.getMySqlConnectionFormMydb();
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select name,password,email,country from employee where email='"+email+"'");
			while(resultSet.next()) {
				list.add(new Employee( resultSet.getString(1),
						resultSet.getString(2), resultSet.getString(3),resultSet.getString(4)));
			
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public void deleteEmployee(String email) {
		// TODO Auto-generated method stub
		Statement statement=null;
		ResultSet resultSet=null;
		try {
			Connection connection=MyConnectionFactory.getMySqlConnectionFormMydb();
			System.out.println(email);
			PreparedStatement pst=connection.prepareStatement("delete from employee where email='"+email+"'");
			pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void updateEmployee(Employee employee) {
		try {
			Connection connection=MyConnectionFactory.getMySqlConnectionFormMydb();
			//System.out.println(employee.getName());
			PreparedStatement pst=connection.prepareStatement("update employee set name=?,password=?,email=?,country=? where email=?");
			pst.setString(1,employee.getName());
			pst.setString(2, employee.getPassword());
			pst.setString(3, employee.getEmail());
			pst.setString(4, employee.getCountry());
			pst.setString(5, employee.getEmail());
			pst.executeUpdate();		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
}


	

	

