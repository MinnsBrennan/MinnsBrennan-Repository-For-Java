package testweek6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import uk.ac.uos.week6.*;

class AssignmentTest {

	@Test
	void textTest() {
		TextString textTest = new TextString("ugh");
		String output = textTest.describe();
		assertEquals("\"ugh\"", output);
	}

	@Test
	void numberTest() {
		NumberString numberTest = new NumberString(16);
		String output = numberTest.describe();
		assertEquals("16", output);
	}

	@Test
	void booleanTest() {
		BooleanString booleanTest = new BooleanString(true);
		String output = booleanTest.describe();
		assertEquals("true", output);
	}

	@Test
	void nullTest() {
		NullString nullTest = new NullString(null);
		String output = nullTest.describe();
		assertEquals("null", output);
	}

	@Test
	void testTextCollection() {
		CollectionDescription list = new CollectionDescription();
		list.add(new TextString("It is I, The Text"));
		assertEquals("[\"It is I, The Text\"]", list.describe());
	}
	
	@Test
	void testNumberCollection() {
		CollectionDescription list = new CollectionDescription();
		list.add(new NumberString(195893));
		assertEquals("[195893]", list.describe());
	}
	
	@Test
	void testTrueBooleanCollection() {
		CollectionDescription list = new CollectionDescription();
		list.add(new BooleanString(true));
		assertEquals("[true]", list.describe());
	}
	
	@Test
	void testFalseBooleanCollection() {
		CollectionDescription list = new CollectionDescription();
		list.add(new BooleanString(false));
		assertEquals("[false]", list.describe());
	}
	
	@Test
	void testNullCollection() {
		CollectionDescription list = new CollectionDescription();
		list.add(new NullString(null));
		assertEquals("[null]", list.describe());
	}
	
	@Test
	void testFullCollection() {
		CollectionDescription list = new CollectionDescription();
		list.add(new TextString("hello there"));
		list.add(new NumberString(839));
		list.add(new BooleanString(true));
		list.add(new BooleanString(false));
		list.add(new NullString(null));
		assertEquals("[\"hello there\", 839, true, false, null]", list.describe());
	}
}
