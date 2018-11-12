package testweek6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import uk.ac.uos.week6.BooleanString;
import uk.ac.uos.week6.NullString;
import uk.ac.uos.week6.NumberString;
import uk.ac.uos.week6.TextString;
import uk.ac.uos.week6.Description;


class AssignmentTest {
	
	@Test
	void truthTest() {
		BooleanString truthTest = new BooleanString(true);
		String output = truthTest.describe();
		assertEquals("true", output);
	}

	@Test
	void numberTest() {
		NumberString numberTest = new NumberString(16.483);
		String output = numberTest.describe();
		assertEquals("16.483", output);
	}
	
	@Test
	void textTest() {
		TextString textTest = new TextString("ugh");
		String output = textTest.describe();
		assertEquals("\"ugh\"", output);
	}
	
	@Test void testDescription() {
		Description dd = new Description();
		dd.add(new TextString("hello there"));
//		collection[1] = new Number();
//		collection[2] = new Text("example");
//		collection[3] = new Truth();
		assertEquals("\"hello there\"", dd.describe());
	}
}



	
	
	