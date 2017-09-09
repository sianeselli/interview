package sianeselli.home.interview.hackerrank.sorting.insert;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;


public class SolutionTest {
	
	@Test
	public void test1(){
		int[] ar= new int[]{2,3,4,5,6,7,8,9,10,1};
		int[] solution= new int[]{1,2,3,4,5,6,7,8,9,10};
		Solution.insertIntoSorted(ar);
		assertArrayEquals(solution, ar);
	}
	
	@Test
	public void test2(){
		int[] ar= new int[]{1,4,3,5,6,2};
		int[] solution= new int[]{1,2,3,4,5,6};
		Solution.insertionSortPart2(ar);
		assertArrayEquals(solution, ar);
	}
	

}
