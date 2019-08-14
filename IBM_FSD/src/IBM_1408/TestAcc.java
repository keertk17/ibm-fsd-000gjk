package IBM_1408;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestAcc {
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String args[]) {
		int accountNumber=0;
		int amount=0;
		Account acc=new Account();
		try {
			System.out.print("AccountNumber: ");
			accountNumber=scanner.nextInt();
			
			System.out.print("Amount: ");
			amount=scanner.nextInt();
			
			acc.createNewAccount(12345, 5000);
			System.out.println(acc.toString());
		} 
		catch (AccountNotValidException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("amount must be numeric");
		}
	}
}
