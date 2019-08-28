package comm.example.controller;
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
	
	private MyConnectionFactory factory=null;
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	
	

	private String name,password,email,country;
    

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
	}


	

	

