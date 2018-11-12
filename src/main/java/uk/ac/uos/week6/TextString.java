package uk.ac.uos.week6;

public class TextString implements Describe {
	private String text;
	public TextString(String text) {
		this.text = text;
	}
	@Override
	public String describe() {
		return "\"" + text + "\"";
	}
}