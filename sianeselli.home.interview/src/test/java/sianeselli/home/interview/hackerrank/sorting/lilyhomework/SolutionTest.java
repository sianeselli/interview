package sianeselli.home.interview.hackerrank.sorting.lilyhomework;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;


public class SolutionTest {
	

	
	@Test
	public void test1(){
		int[] ar= new int[]{2,5,3,1};
		int actual=Solution.solveLilyHomework(ar);
		assertEquals(2, actual);
	}
	
	@Test
	public void test2(){
		int[] ar= new int[]{2,4,3,5,1};
		int actual=Solution.solveLilyHomework(ar);
		assertEquals(3, actual);
	}
	
	@Test
	public void test3(){
		int[] ar= new int[]{2,1,3,5,4};
		int actual=Solution.solveLilyHomework(ar);
		assertEquals(2, actual);
	}
	
	@Test
	public void test4(){
		int[] ar= new int[]{5,1,3,2,4};
		int actual=Solution.solveLilyHomework(ar);
		assertEquals(1, actual);
	}
	
	@Test
	public void test5(){
		int[] ar= new int[]{5,4,3,2,1};
		int actual=Solution.solveLilyHomework(ar);
		assertEquals(0, actual);
	}
	
	

}
