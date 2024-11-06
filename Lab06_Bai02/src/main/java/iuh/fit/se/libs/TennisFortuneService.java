package iuh.fit.se.libs;

public class TennisFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Tennis fortune: Today is your lucky day!";
	}

}
