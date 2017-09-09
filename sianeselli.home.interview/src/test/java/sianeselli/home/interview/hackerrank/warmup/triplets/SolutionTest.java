package sianeselli.home.interview.hackerrank.warmup.triplets;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;


public class SolutionTest {
	
	Solution solution;
	
	int[] listAnswers= {0,0};
	
	@Before
	public void init(){
		solution = new Solution();
	}
	
	@Test
	public void test1(){
		listAnswers = Solution.solve(5,6,7,3,6,10);
		assertEquals(2,listAnswers.length);
		assertEquals(1,listAnswers[0]);
		assertEquals(1,listAnswers[1]);
	}
	

}
