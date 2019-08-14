package comm.example.client;
import comm.example.MyDate;

public class Tester {
	public static void main(String[] args) {
		MyDate myDate=null;
		myDate=new MyDate();
		myDate.createDate(19,10,1997);
		System.out.println(myDate.getDetails());
		System.out.println(myDate.getDay());
		System.out.println(myDate.getMonth());
		System.out.println(myDate.getYear());
		System.out.println(myDate.setDay(32));
		System.out.println(myDate.setMonth(10));
		System.out.println(myDate.setYear(2018));
		System.out.println(myDate.getXYZ());
	}
	

}