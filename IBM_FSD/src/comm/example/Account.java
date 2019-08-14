package comm.example;

public class Account {
 private String name;
 private double balance;
 private static int count;
 static {
	 count=100;
 }
  public Account(){
	  super();
	 
	System.out.println("no of ac:" +count);
		  
  }
}
