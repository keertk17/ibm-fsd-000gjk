package comm.example;

public class Employee {
	private String firstName;
	private String lastName;
	private String dept;
	public Employee() {
		
	}
	public Employee(String firstName,String lastName,String dept) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.dept=dept;
	}
	protected String getEmpDetails() {
		return "FirstName:"+firstName+ 
				" LastName:"+lastName + 
				" Department:"+dept;
	}

}
