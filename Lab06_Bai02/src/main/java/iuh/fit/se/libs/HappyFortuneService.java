package iuh.fit.se.libs;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day! Happy Fortune";
	}

}
