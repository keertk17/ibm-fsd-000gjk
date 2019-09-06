package comm.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	
	
	private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	/*
	 * public void createConnection() { try { Connection
	 * connection=dataSource.getConnection();
	 * System.out.println(connection.toString()); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
	
	public void createEmployee(Employee employee)
	{
		try {
			/*Connection connection=dataSource.getConnection();
			PreparedStatement pst=connection.prepareStatement("insert into employee(id,firstName,lastName,email) values(?,?,?,?)");
			pst.setInt(1, employee.getId());
			pst.setString(2, employee.getFirstName());
			pst.setString(3, employee.getLastName());
			pst.setString(4, employee.getEmail());
			pst.executeUpdate();
			System.out.println("INSERTED..!");*/
			String query="insert into employee(id,firstName,lastName,email) values(?,?,?,?)";
			Object obj[]= {employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getEmail()};
			jdbcTemplate.update(query,obj);
			System.out.println("done");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	

}