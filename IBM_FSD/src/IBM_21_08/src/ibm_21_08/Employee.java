package ibm_21_08;

import java.util.Date;

public class Employee implements Comparable{
    
	private int id=1;
	private String name;
	private String dept;
	private int age;
	private int salary;
	private String doj;
	
	public Employee()
	{
		super();
	}
	
	public Employee(int id, String name, String dept, int age, int salary, String doj) {
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



	public String getDoj() {
		return doj;
	}



	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee employee =(Employee)o;
		if(this.getSalary()==(employee.getSalary()))
		{
			return 0;
		}
		else if((this.getSalary()>employee.getSalary()))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + ", salary=" + salary
				+ ", doj=" + doj + "]";
	}


}
