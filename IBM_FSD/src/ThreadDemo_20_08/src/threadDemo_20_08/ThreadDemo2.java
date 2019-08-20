package threadDemo_20_08;

public class ThreadDemo2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j=0;j<20;j++)
		{
			if(j==10)
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("j:"+j);
		}
	}

}
