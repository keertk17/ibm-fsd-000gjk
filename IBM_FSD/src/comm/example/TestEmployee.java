package comm.example;

public class TestEmployee {
public static void main(String args[]) {
	Employee e=new PermanentEmployee(500);
	System.out.println(e.getEmpDetails());
	 e= new ContractEmployee(200);
	System.out.println(e.getEmpDetails());
}
}
