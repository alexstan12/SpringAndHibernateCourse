package com.alexspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach bestCoach = context.getBean("ronnieColeman", Coach.class);
		
		Coach anotherCoach = context.getBean("trackCoach", Coach.class);
		
		//call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(bestCoach.getDailyWorkout());
		System.out.println(anotherCoach.getDailyWorkout());
		
		//let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		System.out.println(bestCoach.getDailyFortune());
		System.out.println(anotherCoach.getDailyFortune());
		//close the context
		
		context.close();
	}

}
