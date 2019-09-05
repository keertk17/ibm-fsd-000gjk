package comm.spring.spring_employee_04_09;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import comm.bean.Employee;
import comm.bean.EmployeeDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	/*try {
    		ClassPathXmlApplicationContext context=new 
        			ClassPathXmlApplicationContext("applicationContext.xml");
    		Employee employee=context.getBean("theEmployee",Employee.class);
    		System.out.println(employee.getDetails());
    		System.out.println(employee.addresss());
    		context.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}*/
    	
    	ClassPathXmlApplicationContext context=
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDAO dao=context.getBean("eDao",EmployeeDAO.class);
        dao.createEmployee(new Employee(1,"MS","DHONI","msd@gg.com"));
    }
}
