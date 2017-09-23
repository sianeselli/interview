package sianeselli.home.interview.hackerrank.sorting.fraud;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;


public class SolutionTest {
	
	@Test
	public void test1(){
		int[] expenditure= new int[]{2,3,4,2,3,6,8,4,5};
		int d=5;	
		assertEquals(2,Solution.activityNotifications(expenditure, d));
	}
	
	@Test
	public void test2(){
		int[] expenditure= new int[]{1,2,3,4,4};
		int d=4;	
		assertEquals(0,Solution.activityNotifications(expenditure, d));
	}
	

}
