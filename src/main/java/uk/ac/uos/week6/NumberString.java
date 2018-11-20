package uk.ac.uos.week6;

public class NumberString implements Describe {
	private Integer number;

	public NumberString(Integer number) {
		this.number = number;
	}

	@Override
	public String describe() {
		return Integer.toString(number);
	}
}