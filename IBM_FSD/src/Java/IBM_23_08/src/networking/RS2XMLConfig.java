package networking;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ibm_20_08_factory.MyConnectionFactory;

public class RS2XMLConfig {
	
	private MyConnectionFactory factory;
	private Connection connection;
	public RS2XMLConfig() throws SQLException{
		factory=MyConnectionFactory.createObject();
		connection=factory.getConnection();
		
	}
	public ResultSet getAllEmployee() throws SQLException
	{
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery("select id as Id, firstname as FirstName, lastname as LastName, email as Email from employee");
		return rs;
	}
	public ResultSet searchById(int i) throws SQLException
	{
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery("select *from employee where id="+i);
		return rs;
	}
	

}
