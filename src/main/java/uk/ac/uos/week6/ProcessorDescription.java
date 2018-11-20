package uk.ac.uos.week6;

import java.io.IOException;
import java.util.Iterator;

public class ProcessorDescription implements Processor {

	public void isNull() {
		NullString nullObject = new NullString(null);
		describeList.add(nullObject);
	}

	public void isTrueBoolean() {
		BooleanString booleanObject = new BooleanString(true);
		describeList.add(booleanObject);
	}

	public void isFalseBoolean() {
		BooleanString booleanObject = new BooleanString(false);
		describeList.add(booleanObject);
	}

	public void isText(String next) {
		String textString = next.substring(1, next.length() - 1);
		TextString textObject = new TextString(textString);
		describeList.add(textObject);
	}

	public void isNumber(String next) {
		int i = Integer.parseInt(next);
		NumberString numberObject = new NumberString(i);
		describeList.add(numberObject);
	}

	private CollectionDescription describeList;

	@Override
	public void process(Iterator<String> items) throws IOException {
		while (items.hasNext()) {

			String next = items.next().toLowerCase();

			if (next.equals("null")) {
				isNull();
			} else if (next.equals("true")) {
				isTrueBoolean();
			} else if (next.equals("false")) {
				isFalseBoolean();
			} else if (next.substring(0, 1).equals("\"") && next.substring(next.length() - 1).equals("\"")) {
				isText(next);
			} else if (next.matches("\\d+(\\.\\d+)?")) {
				isNumber(next);
			} else {
				throw new IOException("This is invalid");
			}
		}
	}

	public ProcessorDescription() {
		describeList = new CollectionDescription();
	}

	public String CollectionDescription() {
		return describeList.describe();
	}
}
