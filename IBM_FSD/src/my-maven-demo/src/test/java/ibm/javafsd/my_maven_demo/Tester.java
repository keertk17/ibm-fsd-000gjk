package ibm.javafsd.my_maven_demo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tester {
	
	public static void main(String args[]) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
			Session session=factory.openSession();
			/*Employee employee=new Employee("Keeerthana", "kk", "kk@gg.com", "India");
			session.getTransaction().begin();
			session.persist(employee);
			System.out.println("Inserted");
			session.getTransaction().commit();*/
			Query query=session.createQuery("from Employee");
			@SuppressWarnings("unchecked")
			List<Employee>list=query.getResultList();
			for(Employee e:list)
			{
				System.out.println(e);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
