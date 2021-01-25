package com.alexspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load the spring config file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same object " + result);
		System.out.println("memory location for theCoach " + theCoach);
		System.out.println("memory location for alphaCoach " + alphaCoach +"\n");
		
		//close the context
		
		context.close();
		
	}

}
