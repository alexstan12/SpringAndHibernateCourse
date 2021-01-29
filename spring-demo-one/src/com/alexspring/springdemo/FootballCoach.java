package com.alexspring.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class FootballCoach implements Coach, DisposableBean {
	
	private String emailAddress;
	private String team;
	
	FortuneService fortuneService;
	
	public FootballCoach() {
		System.out.println("inside no-args constructor - FootballCoach");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Drible your way out";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	//define an init method
	
	public void doMyStartUpStuff() {
		System.out.println("Football coach: inside doMyStartUpStuff ");
	}
	
//	//define a destroy method
//	
//	public void doMyCleanupStuff() {
//		System.out.println("Football coach: inside doMyCleanupStuff ");
//	}
	
	// add a destroy method
	
	@Override
	public void destroy() throws Exception {
		System.out.println("FootballCoach: inside method doMyCleanupStuffYoYo");		
	}
	
}
