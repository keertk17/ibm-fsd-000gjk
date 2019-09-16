package comm.spring.spring_demo_04_09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.bean.BaseballCoach;
import comm.bean.Coach;
import comm.bean.CricketCoach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
        	
        	ClassPathXmlApplicationContext context=new 
        			ClassPathXmlApplicationContext("applicationContext.xml");
        	Coach myCoach=context.getBean("theCoach",CricketCoach.class);
        	System.out.println(myCoach.getDailyWorkout());
        	System.out.println(myCoach.getDailyFortune());
        	//Coach myCoach1=context.getBean("theCoach",CricketCoach.class);
        	//System.out.println(myCoach==myCoach1);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
