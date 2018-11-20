package uk.ac.uos.week6;

import java.util.ArrayList;
import java.util.List;

public class CollectionDescription implements Describe {

	private List<Describe> mylist = new ArrayList<Describe>();

	@Override
	public String describe() {
		String result = "[";

		for (Describe value : mylist) {
			result = result + value.describe() + ", ";
		}

		if (result.substring(result.length() - 1).equals(" ")) {
			result = result.substring(0, result.length() - 2);
		}

		result = result + "]";
		return result;
	}

	public void add(Describe value) {
		mylist.add(value);
	}
}