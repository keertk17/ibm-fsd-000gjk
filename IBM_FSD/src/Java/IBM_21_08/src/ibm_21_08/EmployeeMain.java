package ibm_21_08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of employee");
		int n=sc.nextInt();
		ArrayList<Employee> list=new ArrayList<Employee>();
		Employee employee=new Employee();
		int id=0;
		while(n!=0)
		{
			
			 id = id+1;
			System.out.print("Employee Name: ");
			String name = sc.next();
			System.out.println("Employee Dept: ");
			String dept=sc.next();
			System.out.println("Employee Age: ");
			int age=sc.nextInt();
			System.out.println("Employee Salary: ");
			int salary=sc.nextInt();
			System.out.println("Employee Date of joining: ");
			String doj=sc.next();
			SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");
			 Date dates=null;
			 try
			 {
			  dates=  d.parse(doj);
			 }catch(ParseException p)
			 {
				 p.printStackTrace();
			 }
			list.add(new Employee(id,name,dept,age,salary,doj));
			n--;
			
		}
		System.out.println("1.Sort by salary\n 2.Sort by Age\n" );
		System.out.println("Enter the choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			Collections.sort(list);
			for(Employee emp:list) {
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDept()+" "+emp.getAge()+" "+emp.getSalary()+" "+emp.getDoj());
			}
				
			break;
		case 2:
		Collections.sort(list, new AgeComparator()); 
		  for (int i=0; i<list.size(); i++) 
          System.out.println (list.get(i)); 
		break;
		
	}
}
}
