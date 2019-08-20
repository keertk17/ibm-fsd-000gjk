package threadDemo_20_08;

public class ThreadDemo3 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
	public static void main(String args[]) {
		ThreadDemo3 myThread3=new ThreadDemo3();
		myThread3.start();
		
	}

}
