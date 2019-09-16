package ibm_20_08_service;

import java.util.List;

import ibm_20_08.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
    public void deleteEmployeeById(Employee employee);
    public void getConnection();
}
