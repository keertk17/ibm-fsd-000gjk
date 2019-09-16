package ibm_20_08_service;

import java.sql.SQLException;
import java.util.List;

import ibm_20_08.Employee;
//import ibm_20_08_dao.EmployeeDao;
import ibm_20_08_dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDaoImpl dao = null;

	public EmployeeServiceImpl() throws SQLException {
		super();
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void createEmployee(Employee employee) {

		dao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {

		return null;
	}
	
	

	@Override
	public void deleteEmployeeById(Employee employee) {
		// TODO Auto-generated method stub
		dao.deleteEmployeeById(employee);
	}

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		dao.getConnection();
	}

}