package ibm_21_08_contact;

import ibm_21_08.Employee;

public class Contact implements Comparable {
	
	private String name;
	private String email;
	private long mobile;
	private String address;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Contact(String name, String email, long mobile, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", mobile=" + mobile + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Contact contact =(Contact)o;
		if(this.getMobile()==(contact.getMobile()))
		{
			return 0;
		}
		else if((this.getMobile()>contact.getMobile()))
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	}
	


