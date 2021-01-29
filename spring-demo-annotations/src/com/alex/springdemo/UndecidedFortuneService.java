package com.alex.springdemo;

public class UndecidedFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "I don't know what to say";
	}

}
