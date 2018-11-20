package uk.ac.uos.week6;

public class BooleanString implements Describe {
	private Boolean truefalse;

	public BooleanString(Boolean truefalse) {
		this.truefalse = truefalse;
	}

	@Override
	public String describe() {
		return Boolean.toString(truefalse);
	}
}
