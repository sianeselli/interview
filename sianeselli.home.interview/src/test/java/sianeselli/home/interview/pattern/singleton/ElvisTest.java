package sianeselli.home.interview.pattern.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElvisTest {

	@Test
	public void test1(){
		Elvis elvis1 = Elvis.INSTANCE;
		Elvis elvis2 = Elvis.INSTANCE;
		elvis1.leaveTheBuilding();
		assertEquals(elvis1,elvis2);
	}
}
