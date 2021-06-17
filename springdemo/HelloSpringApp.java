package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//retrieve spring beans from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call method on bean
		System.out.println(theCoach.GetDailyWorkout());
		
		//call new method
		System.out.println(theCoach.getFortune());
		
		//close the context
		context.close();
	}

}
