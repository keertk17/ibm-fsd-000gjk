package ibm_1908;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JdbcDemo {
	private static Properties properties = null;
	private static Scanner scanner=new Scanner(System.in);
	static {
		properties = new Properties();
		properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/mydb");
		properties.put("USER", "root");
		
		properties.put("PASSWORD", "Prakshi@1509");
	}

	public JdbcDemo() {
		super();

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// register the driver
		/*
		 * 
		 * DriverManager.registerDriver(new org.h2.Driver());
		 * Class.forName("org.h2.Driver");
		 * 
		 * //Connection
		 * connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
		 * "root","Prakshi@1509"); Connection
		 * connection=DriverManager.getConnection(properties.getProperty("JDBC_URL"),
		 * properties.getProperty("USER"),properties.getProperty("PASSWORD")); Statement
		 * statement=connection.createStatement(); ResultSet
		 * resultSet=statement.executeQuery("select * from course");
		 * System.out.println("ID NAME PRICE"); while(resultSet.next()) {
		 * //System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "
		 * +resultSet.getInt(3)); System.out.printf("\n%d %s %d",
		 * resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3)); }
		 */
		
		MySqlConnectionFactory factory=MySqlConnectionFactory.createConnection();
		
		
		Connection connection=factory.getConnection();
		PreparedStatement pst=connection.prepareStatement("insert into courses values(?,?,?)");
		System.out.print("ID: ");
		int id=scanner.nextInt();
		System.out.print("NAME: ");
		String name=scanner.next();
		System.out.print("AMOUNT: ");
		int amount=scanner.nextInt();
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, amount);
		int count=pst.executeUpdate();
		System.out.println(count+" row(s) updated");
		
		

	}

}


