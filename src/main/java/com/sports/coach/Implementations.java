package com.sports.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Implementations {


public static void main(String[] args) {
	 // load the spring configuration file
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Coach.xml");

	// retrieve bean from spring container
	Coach ch=context.getBean("baseball",Coach.class);
	 
	// call methods on the bean
	System.out.println(ch.getDailyWorkout());
	// close the context
			context.close();
}
}
