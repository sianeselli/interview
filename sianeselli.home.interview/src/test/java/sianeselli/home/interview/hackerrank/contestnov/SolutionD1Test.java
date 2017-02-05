package sianeselli.home.interview.hackerrank.contestnov;

import org.junit.Before;
import org.junit.Test;

import sianeselli.home.interview.hackerrank.AbstractLineIntegerHackerRankTest;

public class SolutionD1Test extends AbstractLineIntegerHackerRankTest{
	
	public static final String SPECIFIC_PATH = "contestnov\\";
	
	SolutionD1 solution;

	@Before
	public void init() {
		super.init();
		solution = new SolutionD1();
	}
	
	@Test
	public void test1(){
		prepareTestData(SPECIFIC_PATH, "pbD11.txt", "solD11.txt");
		solution.findSolution(listInputValues, actualListAnswers);
		validateResult();
	}


}
