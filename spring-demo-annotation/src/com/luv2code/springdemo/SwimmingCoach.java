package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Swim in the water!";
	}

	@Override
	public String getDailyFortune() {
		return "Swim like a fish??";
	}

}
