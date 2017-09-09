package sianeselli.home.interview.hackerrank.sorting.invariant;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;


public class SolutionTest {
	

	
	@Test
	public void test1(){
		int[] ar= new int[]{1,4,3,5,6,2};
		int[] solution= new int[]{1,2,3,4,5,6};
		Solution.insertionSort(ar);
		assertArrayEquals(solution, ar);
	}
	
	@Test
	public void test2(){
		int[] ar= new int[]{1,2,3,5,6,4};
		int[] solution= new int[]{1,2,3,4,5,6};
		Solution.insertionSort(ar);
		assertArrayEquals(solution, ar);
	}
	
	@Test
	public void test3(){
		int[] ar= new int[]{1,2,3,5,4,6};
		int[] solution= new int[]{1,2,3,4,5,6};
		Solution.insertionSort(ar);
		assertArrayEquals(solution, ar);
	}
	
	@Test
	public void test4(){
		int[] ar= new int[]{3,2,1,5,4,6};
		int[] solution= new int[]{1,2,3,4,5,6};
		Solution.insertionSort(ar);
		assertArrayEquals(solution, ar);
	}
	

}
