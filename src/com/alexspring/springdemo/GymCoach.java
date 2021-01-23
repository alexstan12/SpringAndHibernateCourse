package com.alexspring.springdemo;

public class GymCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	public GymCoach(FortuneService newFortuneService) {
		this.myFortuneService = newFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Yeah buddy!!!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}

}
