package unitTesting;

public class Calculator {
	private int i;
	private int j;
	private int result;
	public Calculator(int i, int j) {
		super();
		this.i = i;
		this.j = j;
		
	}
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int AddMethod() {
		result=i+j;
		return result;
	}
	/*public int Greater() {
		if(i>j)
			return 1;
		else
			return -1;
	}*/
	
}
