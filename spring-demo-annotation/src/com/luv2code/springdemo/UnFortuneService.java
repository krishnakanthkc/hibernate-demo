package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class UnFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Oh Boy!!!";
	}

}
