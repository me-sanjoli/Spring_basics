package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String GetDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getFortune() {

		return "Odds are in your favour: "+ fortuneService.getFortune();
	}

}
