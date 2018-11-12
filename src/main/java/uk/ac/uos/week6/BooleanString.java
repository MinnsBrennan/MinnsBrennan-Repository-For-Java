package uk.ac.uos.week6;

public class BooleanString implements Describe {
	private Boolean truth;
	public BooleanString(Boolean truth) {
		this.truth = truth;
	}
	@Override
	public String describe() {
		return Boolean.toString(truth);
	}
}
