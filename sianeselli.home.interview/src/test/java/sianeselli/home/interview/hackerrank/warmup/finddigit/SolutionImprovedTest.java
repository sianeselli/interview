package sianeselli.home.interview.hackerrank.warmup.finddigit;

import org.junit.Before;
import org.junit.Test;

import sianeselli.home.interview.hackerrank.AbstractIntegerHackerRankTest;

public class SolutionImprovedTest extends AbstractIntegerHackerRankTest {

	public static final String SPECIFIC_PATH = "warmup\\finddigit\\";

	Solution solution;

	@Before
	public void init() {
		super.init();
		solution = new Solution();
	}

	@Test
	public void test1() {
		prepareTestData(SPECIFIC_PATH, "pb1.txt", "sol1.txt");
		solution.findSolutions(listInputValues, actualListAnswers);
		validateResult();
	}
	
	@Test
	public void test2() {
		prepareTestData(SPECIFIC_PATH, "pb2.txt", "sol2.txt");
		solution.findSolutions(listInputValues, actualListAnswers);
		validateResult();
	}

}
