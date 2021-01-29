package com.alexspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		//load the spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		
		//CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		FootballCoach footballCoach = context.getBean("footballCoach", FootballCoach.class);
		
		//call methods on the bean
		/*System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());*/
		System.out.println(footballCoach.getDailyWorkout());
		System.out.println(footballCoach.getDailyFortune());
		System.out.println(footballCoach.getEmailAddress());
		System.out.println(footballCoach.getTeam());
		
		//call methods to get literal values
		
		/*System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());*/
		//close the context
		context.close();
		
	}

}
