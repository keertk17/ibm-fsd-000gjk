package comm.example;

public class Student extends Person {
	
	private String stream;
	public Student() {
		
	}
	public Student(String stream) {
		super("Keerthana","Chennai"); //used to call base class constructor
		this.stream=stream;
	}
	public String getDetails() {
		return super.getDetails() +"streaam" +stream; //super keyword is used to call the base class inherited method
	}

}
