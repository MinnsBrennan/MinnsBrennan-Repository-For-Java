package uk.ac.uos.week6;

public class NumberString implements Describe {
	private Double number;
	public NumberString(Double number) {
		this.number = number;
	}
	@Override
	public String describe() {
		return Double.toString(number);
	}
}