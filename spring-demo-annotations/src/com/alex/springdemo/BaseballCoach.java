package com.alex.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println(">>BaseballCoach : inside constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Ball until you get it right";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
