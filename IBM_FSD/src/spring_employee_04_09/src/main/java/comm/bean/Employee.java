package comm.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component("theEmployee")

public class Employee implements Address {
	 
	
	//@Value("${id}")
	 private int id;
	//@Value("${firstName}")
	 private String firstName;
	//@Value("${lastName}")
	 private String lastName;
	//@Value("${email}")
	 private String email;
	 public Address address;
		

		//@Autowired	
		//public Employee(Address address) {
		//	this.address = address;
		//}
		
	 public Employee(int id, String firstName, String lastName, String email) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
	 
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "";
	}
	public String getDetails() {
		return toString();
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	//public String getAddress() {
		// TODO Auto-generated method stub
	//	return address.addresss();
	//}
	
	public void initEmployee() {
		System.out.println("HELLO EMPLOYEE");
	}
	public void destEmployee() {
		System.out.println("DESTROYED");
	}



	public String addresss() {
		// TODO Auto-generated method stub
		return address.addresss();
	}



	
}
