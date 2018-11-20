package uk.ac.uos.week6;

public class NullString implements Describe {
	private String invalid;

	public NullString(String invalid) {
		this.invalid = invalid;
	}

	@Override
	public String describe() {
		if (invalid == null) {
			invalid = "null";
		}
		return invalid;
	}
}