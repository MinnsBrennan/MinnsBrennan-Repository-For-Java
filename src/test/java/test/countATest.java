package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import uk.ac.uos.i2p.SimpleMath;

class countATest {

	@Test
	public void test() {
		SimpleMath test = new SimpleMath();
		int output = test.countA("JavaBean");
		assertEquals(3, output);
	}

}
