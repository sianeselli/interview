package sianeselli.home.interview.hackerrank.warmup.bigsum;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;


public class SolutionTest {
	
	Solution solution;
	
	long answer;
	
	@Before
	public void init(){
		solution = new Solution();
	}
	
	@Test
	public void test1(){
		long[] ar = new long[5];
		ar[0]=1000000001L;
		ar[1]=1000000002L;
		ar[2]=1000000003L;
		ar[3]=1000000004L;
		ar[4]=1000000005L;
		answer = Solution.aVeryBigSum(5,ar);
		assertEquals(5000000015L,answer);
	}
	

}
