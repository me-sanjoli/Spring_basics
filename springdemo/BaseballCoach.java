package com.springdemo;

public class BaseballCoach implements Coach{
	//define a private field for dependencies
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String GetDailyWorkout() {
		return "spend 30 minutes on batting practise";
	}

	@Override
	public String getFortune() {
		//user my fortuneService to get a fortune 
		
		return fortuneService.getFortune();
	}
}
