package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import uk.ac.uos.i2p.WeekTwoHomework;

class WeekTwoHomeworkTest {

	@Test
	public void Format() {
		WeekTwoHomework test = new WeekTwoHomework();
		String output = test.fullName("Brennan", "Joel", "Minns");
		assertEquals("Brennan Joel Minns", output);
	}

	@Test
	public void CamelCase() {
		WeekTwoHomework test = new WeekTwoHomework();
		String output = test.fullName("brennan", "joel", "minns");
		
		assertEquals("Brennan Joel Minns", output);
	}
}