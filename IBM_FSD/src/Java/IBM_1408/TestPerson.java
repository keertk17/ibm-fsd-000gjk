package IBM_1408;

import java.util.Scanner;

public class TestPerson {
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String args[]) {
	
		String firstName=null;
		String lastName=null;
		Person p1=new Person("Keerthana","Kumar");
		Person p2=new Person("Keerthana","Kumar");
		try {
		 	if(p1.equals(p2))
		 	{
		 	 throw new PersonNotValidException("the name already exist");
		 	 }
		}
			/*System.out.print("FirstName: ");
			firstName=scanner.nextLine();
			
			System.out.print("LastName: ");
			lastName=scanner.nextLine();
			
			p.createName("Keerthana", "Kumar");
			System.out.println(p.toString());
			
			p1.createName("Stefie", "Bose");
			System.out.println(p1.toString());
 
 
		}*/
		catch (PersonNotValidException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
}
}

