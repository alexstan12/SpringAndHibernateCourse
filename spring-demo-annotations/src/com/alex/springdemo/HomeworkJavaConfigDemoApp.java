package com.alex.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HomeworkJavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HomeworkConfig.class);
		
		BaseballCoach myCoach = context.getBean("baseballCoach", BaseballCoach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		context.close();
		
	}

}
