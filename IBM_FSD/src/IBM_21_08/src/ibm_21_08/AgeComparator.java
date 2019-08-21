package ibm_21_08;

import java.util.Comparator;
import java.util.Date;

public class AgeComparator implements Comparator<Employee> {

	private int id=1;
	private String name;
	private String dept;
	private int age;
	private int salary;
	private int doj;
	
	public AgeComparator()
	{
		super();
	}
	
	public AgeComparator(int id, String name, String dept, int age, int salary, int doj) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
		this.doj = doj;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int getDoj() {
		return doj;
	}



	public void setDoj(int doj) {
		this.doj = doj;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}
	
	

	@Override
	public String toString() {
		return "AgeComparator id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + ", salary=" + salary
				+ ", doj=" + doj ;
	}

}
