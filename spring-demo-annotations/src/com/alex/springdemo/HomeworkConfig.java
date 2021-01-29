package com.alex.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HomeworkConfig {
	
	@Bean
	public FortuneService undecidedFortuneService() {
		return new UndecidedFortuneService();
	}
	
	@Bean
	public Coach baseballCoach() {
		return new BaseballCoach(undecidedFortuneService());
	}
}
