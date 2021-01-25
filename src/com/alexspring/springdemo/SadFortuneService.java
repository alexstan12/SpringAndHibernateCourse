package com.alexspring.springdemo;

public class SadFortuneService implements FortuneService {

	String[] fortuneArr = {"Not so good", "Work your ass off", "Move, you lazy bastard"};
	@Override
	public String getFortune() {
		int randomIndex = (int)(Math.random()*fortuneArr.length);
		return fortuneArr[randomIndex];
	}

}
