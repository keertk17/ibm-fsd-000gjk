package comm.bean;

public class BaseballCoach implements Coach {
	
	public FortuneService fortuneService;

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice basketball volley";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortuneService();
	}

}
