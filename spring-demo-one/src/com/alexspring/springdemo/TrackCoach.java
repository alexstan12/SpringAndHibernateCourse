package com.alexspring.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	//define an init method
	
	public void doMyStartUpStuff() {
		System.out.println("Track coach: inside doMyStartUpStuff ");
	}
	
	//define a destroy method
	
	public void doMyCleanupStuff() {
		System.out.println("Track coach: inside doMyCleanupStuff ");
	}
	
}
