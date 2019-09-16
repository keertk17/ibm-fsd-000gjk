package threadDemo_20_08;

public class StackProducerConsumerTester {

	private final static MyStack myStack=new MyStack();

	public static void main(String[] args) {
		
		Thread t1=new Thread(new StackProducer(myStack));
		Thread t2=new Thread(new StackConsumer(myStack));
		t1.start();
		t2.start();
	}
}
