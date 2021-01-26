package com.alex.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WheelOfLuckFortuneService implements FortuneService {

	@Value("${fortune.array}")
	private String[] fortunes;
	
	@Override
	public String getFortune() {
		Random random = new Random();
		int position = random.nextInt(fortunes.length);
		return fortunes[position];
	}

}
