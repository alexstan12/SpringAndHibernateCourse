package com.alex.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	/*
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;*/
	private FortuneService fortuneService;
	
	@Autowired
	public SwimCoach(@Qualifier("fileFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside SwimCoach constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Swim the whole length, twice !";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
