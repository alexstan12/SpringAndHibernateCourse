package com.alex.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Push it harder";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
