package com.alex.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		
		//Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//Coach secondCoach = context.getBean("gymCoach", Coach.class);
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call a method on the bean
		
		System.out.println(swimCoach.getDailyWorkout());
		//System.out.println(secondCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		// call our new swim methods ... has the props values injected
		System.out.println("email: " + swimCoach.getEmail());
		System.out.println("team: " + swimCoach.getTeam());

		//close the context
		
		context.close();
	}

}
