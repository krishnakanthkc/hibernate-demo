package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("unFortuneService")
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	public FortuneService getFortuneService() {
		return fortuneService;
	}

//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("By the setter...");
//		this.fortuneService = fortuneService;
//	}
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice Tennis you a** h*l@\nemail:"+email;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doStartUp() {
		System.out.println("Starting up...");
	}
	@PreDestroy
	public void doCleanUp() {
		System.out.println("Distruction...");
	}
}
