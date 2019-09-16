package ibm_21_08_password;

import java.util.Scanner;

public class Main {
		
		public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the password");
		String password=sc.next();
		UserMainCode umc=new UserMainCode();
		if(umc.checkPassword(password)==true)
		{
			System.out.println("valid password");
		}
		else
		{
			System.out.println("invalid password");
		}
		}
		
}
