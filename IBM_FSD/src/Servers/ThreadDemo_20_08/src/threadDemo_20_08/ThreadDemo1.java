package threadDemo_20_08;

public class ThreadDemo1 implements Runnable {
	
	public static void main(String args[]) {
	
		ThreadDemo1 myThread1= new ThreadDemo1();
		ThreadDemo2 myThread2=new ThreadDemo2();
		Thread t1= new Thread(myThread1);
		Thread t2=new Thread(myThread2);
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t2.isAlive());
		
	}

	@Override
	public void run() {
		try {
		for(int i=0;i<20;i++)
			{
			System.out.println("i:"+i);
			if(i==10)
			{
				Thread.sleep(2000); //forcefully sending thread to sleep
				//Thread.yield();
			}
			}
		}
		catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

	}
}
