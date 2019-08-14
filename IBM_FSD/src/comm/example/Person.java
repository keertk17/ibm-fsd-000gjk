package comm.example;

public class Person {
	private String name;
	private String address;
	public Person() {
		System.out.println("Person class constructor");
	}
	public Person(String name,String address) {
		this.name=name;
		this.address=address;
	
	}
	public String getDetails() {
		return "name:" +name+ "address"+address;
	}
}
