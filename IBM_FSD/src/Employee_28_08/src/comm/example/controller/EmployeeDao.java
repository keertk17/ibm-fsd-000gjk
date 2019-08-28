
package comm.example.controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import comm.example.model.Employee;

public interface EmployeeDao {
	public void createEmployee(Employee employee);
	public List viewEmployee(Employee employee) throws SQLException;
	//public void getConnection();

}

