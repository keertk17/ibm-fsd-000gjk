package comm.bean;

public class CricketCoach implements Coach{
	
	public FortuneService fortuneService;
	
	

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice 200m running";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortuneService();
	}

}
