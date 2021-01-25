package com.alexspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		//load the spring config file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from container
		
		Coach coach1 = context.getBean("myCoach", Coach.class);
		
		Coach coach2 = context.getBean("myCoach", Coach.class);
		
		Coach coach3 = context.getBean("footballCoach", Coach.class);
		
		Coach coach4 = context.getBean("footballCoach", Coach.class);

	
		System.out.println("Are they the same: " + (coach1==coach2));
		System.out.println(coach1);
		System.out.println(coach2);
		System.out.println("Are they the same: " + (coach3==coach4));
		System.out.println(coach3);
		System.out.println(coach4);

		//close the context
		
		context.close();
		
	}

}
