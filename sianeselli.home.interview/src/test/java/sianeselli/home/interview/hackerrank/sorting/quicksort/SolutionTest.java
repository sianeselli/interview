package sianeselli.home.interview.hackerrank.sorting.quicksort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static java.util.Arrays.asList;	

public class SolutionTest {

	@Test
	public void test1() {
		int[] ar = new int[] { 4, 5, 3, 7, 2 };
		List<Integer> expected = asList(3, 2, 4, 5, 7);
		ArrayList<Integer> actual = Solution.quickSort(ar);
		Assert.assertTrue(actual.equals(expected));
	}

}
