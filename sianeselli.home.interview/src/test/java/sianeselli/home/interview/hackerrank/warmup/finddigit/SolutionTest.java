package sianeselli.home.interview.hackerrank.warmup.finddigit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	Solution solution;

	List<Integer> listInputValues = new ArrayList<Integer>();
	List<Integer> listAnswers = new ArrayList<Integer>();

	@Before
	public void init() {
		solution = new Solution();
		listAnswers.clear();
		listInputValues.clear();
	}

	@Test
	public void test1() {
		listInputValues.add(12);
		solution.findSolutions(listInputValues, listAnswers);
		assertEquals(1, listAnswers.size());
		assertEquals(Integer.valueOf(2), listAnswers.get(0));
	}

	@Test
	public void test2() {
		listInputValues.add(15);
		listInputValues.add(25);
		listInputValues.add(12);
		listInputValues.add(121);
		solution.findSolutions(listInputValues, listAnswers);
		assertEquals(4, listAnswers.size());
		assertEquals(Integer.valueOf(2), listAnswers.get(0));
		assertEquals(Integer.valueOf(1), listAnswers.get(1));
		assertEquals(Integer.valueOf(2), listAnswers.get(2));
		assertEquals(Integer.valueOf(2), listAnswers.get(3));
	}

	@Test
	public void test3() {
		listInputValues.add(123456789);
		listInputValues.add(114108089);
		listInputValues.add(110110015);
		listInputValues.add(121);
		listInputValues.add(33);
		listInputValues.add(44);
		listInputValues.add(55);
		listInputValues.add(66);
		listInputValues.add(77);
		listInputValues.add(88);
		listInputValues.add(106108048);
		solution.findSolutions(listInputValues, listAnswers);
		assertEquals(11, listAnswers.size());
		assertEquals(Integer.valueOf(3), listAnswers.get(0));
		assertEquals(Integer.valueOf(3), listAnswers.get(1));
		assertEquals(Integer.valueOf(6), listAnswers.get(2));
		assertEquals(Integer.valueOf(2), listAnswers.get(3));
		assertEquals(Integer.valueOf(2), listAnswers.get(4));
		assertEquals(Integer.valueOf(2), listAnswers.get(5));
		assertEquals(Integer.valueOf(2), listAnswers.get(6));
		assertEquals(Integer.valueOf(2), listAnswers.get(7));
		assertEquals(Integer.valueOf(2), listAnswers.get(8));
		assertEquals(Integer.valueOf(2), listAnswers.get(9));
		assertEquals(Integer.valueOf(5), listAnswers.get(10));
	}

}
