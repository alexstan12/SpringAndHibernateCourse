package com.alexspring.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the object
		Coach theCoach = new TrackCoach(null);
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
