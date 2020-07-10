package com.sooriya;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args)
	{
		
		// Since we are configuring using pure java code - AnnotationConfigApplicationContext
		//creating spring container and loading configuration file
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(SportConfig.class);
		// retrieving beans from the container
		TennisCoach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		//calling methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getName());
		System.out.println("Singleton " +(theCoach==alphaCoach));
		context.close();
	}
}
