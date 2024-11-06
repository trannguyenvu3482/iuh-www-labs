package iuh.fit.se.libs;

public class TennisCoach implements Coach {
	private FortuneService fortuneService;

	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "TennisCoach: Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
