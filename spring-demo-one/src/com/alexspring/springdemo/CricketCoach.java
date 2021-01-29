package com.alexspring.springdemo;

public class CricketCoach implements Coach {
	
		
	private FortuneService fortuneService;
	
	//add new private fields
	private String emailAddress;
	private String team;
	
	
	//create no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket-coach: inside no-arg constructor");
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Cricket-coach: inside setter method - setFortuneService");
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("Cricket-coach: inside setter method - setEmailAddress");
	}


	public void setTeam(String team) {
		this.team = team;
		System.out.println("Cricket-coach: inside setter method - setTeam");
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}
	
	
	

}
