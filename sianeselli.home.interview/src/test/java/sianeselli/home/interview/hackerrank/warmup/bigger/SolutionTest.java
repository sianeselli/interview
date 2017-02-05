package sianeselli.home.interview.hackerrank.warmup.bigger;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	
	Solution solution;
	
	List<String> listInputValues = new ArrayList<String>();
	List<String> listAnswers= new ArrayList<String>();
	
	@Before
	public void init(){
		solution = new Solution();
		listAnswers.clear();
		listInputValues.clear();
	}
	
	@Test
	public void test1(){
		listInputValues.add("ab");
		listInputValues.add("bb");
		listInputValues.add("hefg");
		solution.findSolutions(listInputValues, listAnswers);
		assertEquals(3,listAnswers.size());
		assertEquals("ba",listAnswers.get(0));
		assertEquals("no answer",listAnswers.get(1));
		assertEquals("hegf",listAnswers.get(2));
	}
	
	@Test
	public void test2(){
		listInputValues.add("zedawdvyyfumwpupuinbdbfndyehircmylbaowuptgmw");
		listInputValues.add("zyyxwwtrrnmlggfeb");
		listInputValues.add("ocsmerkgidvddsazqxjbqlrrxcotrnfvtnlutlfcafdlwiismslaytqdbvlmcpapfbmzxmftrkkqvkpflxpezzapllerxyzlcf");
		listInputValues.add("zzyyxxxxxwwwwwvvvvutttttsssssrrrrqqqppponnnnmmmmllkkjjjjiiggffffffeedddddbbbbbba");
		listInputValues.add("jnmvvaybncmoazujefictednlyjuhonfchvpqfelbwc");
		solution.findSolutions(listInputValues, listAnswers);
		assertEquals(5,listAnswers.size());
		assertEquals("zedawdvyyfumwpupuinbdbfndyehircmylbaowuptgwm",listAnswers.get(0));
		assertEquals("no answer",listAnswers.get(1));
		assertEquals("ocsmerkgidvddsazqxjbqlrrxcotrnfvtnlutlfcafdlwiismslaytqdbvlmcpapfbmzxmftrkkqvkpflxpezzapllerxyzlfc",listAnswers.get(2));
		assertEquals("no answer",listAnswers.get(3));
		assertEquals("jnmvvaybncmoazujefictednlyjuhonfchvpqfelcbw",listAnswers.get(4));
	}
	
	@Test
	public void test3(){
		listInputValues.add("jnmvvaybncmoazujefictednlyjuhonfchvpqfelbwc");
		solution.findSolutions(listInputValues, listAnswers);
		assertEquals(1,listAnswers.size());
		assertEquals("jnmvvaybncmoazujefictednlyjuhonfchvpqfelcbw",listAnswers.get(0));
	}


}
