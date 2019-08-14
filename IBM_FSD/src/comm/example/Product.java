package comm.example;

public class Product {
	private int currentRate;
	static int item;
	public Product() {
		
	}
	public Product(int currentRate) {
		item++;
		this.currentRate=currentRate;
	}
	
	static {
		item=0;
	}
	public static int getCount() {
		return item;
	
	}

}
