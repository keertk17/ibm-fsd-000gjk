package IBM_1308;

public class Dog {
	
	private String name;
	private String breed;
	
	
	
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public Dog() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void createLivingthing() {
		//anonymus inner class
	   Livingthing	livingthing=new Livingthing() {

			@Override
			public void walk() {
				// TODO Auto-generated method stub
				System.out.println("Dog name:" +getName()+ "Dog breed:"+getBreed()+ "can also walk");
			}
			
		};
		livingthing.walk();
	}
}
