package com.sooriya;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
    
	@Autowired
	private FortuneService fortuneService;
	@Value("${name}")
	private String name;
	@Value("${email}")
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice in nets for daily 30 mins";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	@PostConstruct
	public void initmethod()
	{
		System.out.println("Inside init method");
	}
    @PreDestroy
    public void destroymethod()
    {
    	System.out.println("Inside destroy method");
    }
}
