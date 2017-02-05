package sianeselli.home.interview.hackerrank.warmup.utopiantree;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import sianeselli.home.interview.hackerrank.warmup.utopiantree.Solution;

public class SolutionTest {
	
	Solution solution;
	
	List<Integer> listInputValues = new ArrayList<Integer>();
	List<Integer> listAnswers= new ArrayList<Integer>();
	
	@Before
	public void init(){
		solution = new Solution();
		listAnswers.clear();
		listInputValues.clear();
	}
	
	@Test
	public void test1(){
		listInputValues.add(0);
		listInputValues.add(1);
		solution.findSolutions(listInputValues, listAnswers);
		assertEquals(2,listAnswers.size());
		assertEquals(Integer.valueOf(1),listAnswers.get(0));
		assertEquals(Integer.valueOf(2),listAnswers.get(1));
	}
	
	@Test
	public void test2(){
		listInputValues.add(3);
		listInputValues.add(4);
		solution.findSolutions(listInputValues, listAnswers);
		assertEquals(2,listAnswers.size());
		assertEquals(Integer.valueOf(6),listAnswers.get(0));
		assertEquals(Integer.valueOf(7),listAnswers.get(1));
	}

}
