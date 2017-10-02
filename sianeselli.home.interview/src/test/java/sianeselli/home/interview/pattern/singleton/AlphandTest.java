package sianeselli.home.interview.pattern.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlphandTest {

	@Test
	public void test1(){
		Alphand alphand1 = Alphand.getInstance();
		Alphand alphand2 = Alphand.getInstance();
		assertEquals(alphand1,alphand2);
	}
}
