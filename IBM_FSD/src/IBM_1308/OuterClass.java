package IBM_1308;

public class OuterClass {
 private int x;
 private int y;
 public OuterClass() {
	 
 }
 public OuterClass(int x,int y) {
	 super();
	 this.x=x;
	 this.y=y;
 }
 public void outerMethod() {
	 System.out.println("Calling outer method x="+x+" y="+y);
 }

 public class InnerClass{
	public InnerClass() {
		
	}
	public void innerMethod() {
		outerMethod();
		x=10;
		y=20;
		System.out.println("Calling inner method x="+x+" y="+y);
	}
}
}