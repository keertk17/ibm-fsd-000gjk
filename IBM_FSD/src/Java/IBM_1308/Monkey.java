package IBM_1308;

public class Monkey implements Livingthing {
	
	private String name;
	
	public Monkey(String name) {
		super();
		this.name = name;
	}
	
	public Monkey() {
		
	}
	
	@Override
	public void walk() {
		System.out.println(getName()+" can also walk");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
