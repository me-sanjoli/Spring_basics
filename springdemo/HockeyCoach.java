package com.springdemo;

public class HockeyCoach implements Coach {
	
	public HockeyCoach() {
		
	}
	private FortuneService fortuneService;
	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String GetDailyWorkout() {
	
		return "Do 20 minutes of leg exercise";
	}

	@Override
	public String getFortune() {

		return "Maybe luck is not in your favour but : "+ fortuneService.getFortune();

	}

}
