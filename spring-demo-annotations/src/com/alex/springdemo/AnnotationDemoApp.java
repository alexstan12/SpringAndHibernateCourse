package com.alex.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		
		//Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//Coach secondCoach = context.getBean("gymCoach", Coach.class);
		Coach thirdCoach = context.getBean("swimCoach", Coach.class);
		
		//call a method on the bean
		
		System.out.println(thirdCoach.getDailyWorkout());
		//System.out.println(secondCoach.getDailyWorkout());
		System.out.println(thirdCoach.getDailyFortune());

		//close the context
		
		context.close();
	}

}
