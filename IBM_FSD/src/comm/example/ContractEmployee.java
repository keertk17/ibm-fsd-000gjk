package comm.example;

public class ContractEmployee extends Employee {
private int Rph;
public ContractEmployee() {
	
}
public ContractEmployee(int Rph){
	super("Stefie","Bose","Cognos");
	this.Rph=Rph;
	
}
public String getEmpDetails() {
	return super.getEmpDetails() +" Rph:"+Rph;
}
}
