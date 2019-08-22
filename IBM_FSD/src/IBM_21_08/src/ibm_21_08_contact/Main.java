package ibm_21_08_contact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import ibm_21_08.Employee;


public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of contact");
		int n=sc.nextInt();
		ArrayList<Contact> list=new ArrayList<Contact>();
		Contact contact = new Contact();
		while(n!=0)
		{
			System.out.println("Enter contact details");
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter email");
			String email=sc.next();
			System.out.println("Enter mobile");
			long mobile=sc.nextLong();
			System.out.println("Enter address");
			String address=sc.next();
			list.add(new Contact(name,email,mobile,address));
			n--;
		}
		Collections.sort(list);
		for(Contact con:list) {
			System.out.println(con.getName()+" "+con.getMobile());
		}
	}
}
