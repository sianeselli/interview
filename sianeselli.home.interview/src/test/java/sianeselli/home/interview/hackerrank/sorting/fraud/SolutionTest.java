package sianeselli.home.interview.hackerrank.sorting.fraud;

import static org.junit.Assert.*;


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
	
	@Test
	public void test3(){
		int[] expenditure= new int[]{2,3,4,2,3,6,8,4,5};
		int d=5;	
		assertEquals(2,Solution.activityNotifications(expenditure, d));
	}
	
	@Test
	public void test4(){
		int[] expenditure= new int[]{1,2,2,3,5,4,4};
		int d=4;	
		assertEquals(1,Solution.activityNotifications(expenditure, d));
	}
	
	@Test
	public void test5(){
		int[] expenditure= new int[]{1,2,5,3,4,4,4};
		int d=4;	
		assertEquals(0,Solution.activityNotifications(expenditure, d));
	}
	
	@Test
	public void test6(){
		int[] expenditure= new int[]{8,2,8,3,5,4,4};
		int d=4;	
		assertEquals(0,Solution.activityNotifications(expenditure, d));
	}
	
	@Test
	public void test7(){
		int[] expenditure= new int[]{64,143,137,68,67,49,86,151,65,72,187};
		int d=3;	
		assertEquals(2,Solution.activityNotifications(expenditure, d));
	}

}
