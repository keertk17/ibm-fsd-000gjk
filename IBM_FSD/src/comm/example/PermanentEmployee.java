package comm.example;

public class PermanentEmployee extends Employee {
	private int sal;
	public PermanentEmployee() {
	
	}
	public PermanentEmployee(int sal) {
		super("Keerthana","Kumar","FSD");
		this.sal=sal;
	}
	public String getEmpDetails() {
		return super.getEmpDetails() +" Salary:"+sal;
	}

}
