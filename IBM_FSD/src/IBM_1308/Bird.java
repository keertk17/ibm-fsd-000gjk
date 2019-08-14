package IBM_1308;

public class Bird extends Flyer {

	@Override
	public void takeoff() {
		System.out.println("Bird takeoff");
		
	}

	@Override
	public void fly() {
	
		System.out.println("Bird Fly");
	}

	@Override
	public void land() {
		System.out.println("Bird land");
		
	}
	
}
