package com.alex.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data = {"Beware of the wolf",
			"Diligence is the mother of good luck",
			"The journey is the reward"};
	
	//create a randum number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
