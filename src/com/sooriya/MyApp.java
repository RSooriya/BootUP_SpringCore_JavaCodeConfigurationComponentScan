package com.sooriya;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(SportConfig.class);
		TennisCoach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getName());
		System.out.println("Singleton " +(theCoach==alphaCoach));
		context.close();
	}
}
