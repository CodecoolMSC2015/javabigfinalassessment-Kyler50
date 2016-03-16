package common;

public class Skill {
	String name;
	String descreption;
	double rate;

	public Skill(String name, String descreption) {
		this.name = name;
		this.descreption = descreption;
	}

	public String getName() {
		return name;
	}

	public String getDescreption() {
		return descreption;
	}

	public double getRate() {
		return rate;
	}

}
