package sianeselli.home.interview.hackerrank.graphe.moon;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;


public class SolutionTest {
	
	@Test
	public void test1(){
		HashMap<Integer,ArrayList<Integer>> astronautsPairsSameCountry= new  HashMap<Integer, ArrayList<Integer>>();
		astronautsPairsSameCountry.put(0, new ArrayList<Integer>());
		astronautsPairsSameCountry.put(1, new ArrayList<Integer>());
		astronautsPairsSameCountry.put(2, new ArrayList<Integer>());
		astronautsPairsSameCountry.put(3, new ArrayList<Integer>());
		astronautsPairsSameCountry.put(4, new ArrayList<Integer>());
		astronautsPairsSameCountry.get(0).add(1);
		astronautsPairsSameCountry.get(1).add(0);
		astronautsPairsSameCountry.get(2).add(3);
		astronautsPairsSameCountry.get(3).add(2);
		astronautsPairsSameCountry.get(0).add(4);
		astronautsPairsSameCountry.get(4).add(0);
		assertEquals(6,Solution.solve(5,astronautsPairsSameCountry));
	}
	
	
	@Test
	public void test2(){
		HashMap<Integer,ArrayList<Integer>> astronautsPairsSameCountry= new  HashMap<Integer, ArrayList<Integer>>();
		astronautsPairsSameCountry.put(0, new ArrayList<Integer>());
		astronautsPairsSameCountry.put(1, new ArrayList<Integer>());
		astronautsPairsSameCountry.put(2, new ArrayList<Integer>());
		astronautsPairsSameCountry.put(3, new ArrayList<Integer>());
		astronautsPairsSameCountry.get(0).add(2);
		astronautsPairsSameCountry.get(2).add(0);
		assertEquals(5,Solution.solve(4,astronautsPairsSameCountry));
	}
	
}
