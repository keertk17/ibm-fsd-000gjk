package fileIODb;

import java.io.*;
import ibm_20_08.Employee;
import ibm_20_08_service.EmployeeService;
import ibm_20_08_service.EmployeeServiceImpl;
import java.sql.*;

public class FileIoDb {
	public static void main(String args[]) throws IOException,SQLException {
		FileReader in=new FileReader(new File("Employee.txt"));
		BufferedReader input=new BufferedReader(in);
		String line=input.readLine();
		
		EmployeeService emp =new EmployeeServiceImpl();
		while(line!=null)
		{
			String arr[]=line.split(" ");
			int id=Integer.parseInt(arr[0]);
			String firstName=arr[1];
			String lastName=arr[2];
			String email=arr[3];
			emp.createEmployee(new Employee(id,firstName,lastName,email));
			System.out.println(line);
			line=input.readLine();
		}
		
		in.close();
		input.close();
}
}
