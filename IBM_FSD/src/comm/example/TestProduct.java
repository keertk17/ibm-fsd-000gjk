package comm.example;

public class TestProduct {
	public static void main(String args[]) {
	Product p=new Book("JavaBasics","Mike");
	System.out.println(p.getClass().getName());
	//p.getBookDetails();
	System.out.println(Product.getCount());
	}
}
