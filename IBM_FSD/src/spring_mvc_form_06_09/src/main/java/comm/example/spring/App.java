package comm.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	

	public static void main(String args[]) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(App.class);
	}
}
