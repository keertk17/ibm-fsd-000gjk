package ibm_1908;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set=new TreeSet<Student>();
		set.add(new Student("A","B",4.5));
		set.add(new Student("A","B",5));
		set.add(new Student("A","B",3.5));
		Object[] obj=set.toArray();
		Student s=null;
		for(Object o:obj)
		{
			s=(Student)o;
			System.out.printf("name: %s %s GPA: %.1f\n",s.getFirstName(),s.getLastName(),s.getGPA());
		}
	}

}
