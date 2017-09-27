package sianeselli.home.interview.hackerrank.graphe.moon;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;


public class SolutionTest {
	
	@Test
	public void test1(){
		HashMap<Integer,ArrayList<Integer>> astronautsPairsSameCountry= new  HashMap<Integer, ArrayList<Integer>>();
		for (int i=0;i<5;i++){
			astronautsPairsSameCountry.put(i, new ArrayList<Integer>());
		}
		astronautsPairsSameCountry.get(0).add(1);
		astronautsPairsSameCountry.get(1).add(0);
		astronautsPairsSameCountry.get(2).add(3);
		astronautsPairsSameCountry.get(3).add(2);
		astronautsPairsSameCountry.get(0).add(4);
		astronautsPairsSameCountry.get(4).add(0);
		assertEquals(6L,Solution.solve(5,astronautsPairsSameCountry));
	}
	
	
	@Test
	public void test2(){
		HashMap<Integer,ArrayList<Integer>> astronautsPairsSameCountry= new  HashMap<Integer, ArrayList<Integer>>();
		for (int i=0;i<4;i++){
			astronautsPairsSameCountry.put(i, new ArrayList<Integer>());
		}
		astronautsPairsSameCountry.get(0).add(2);
		astronautsPairsSameCountry.get(2).add(0);
		assertEquals(5L,Solution.solve(4,astronautsPairsSameCountry));
	}
	
	@Test
	public void test3(){
		HashMap<Integer,ArrayList<Integer>> astronautsPairsSameCountry= new  HashMap<Integer, ArrayList<Integer>>();
		for (int i=0;i<100000;i++){
			astronautsPairsSameCountry.put(i, new ArrayList<Integer>());
		}
		astronautsPairsSameCountry.get(1).add(2);
		astronautsPairsSameCountry.get(2).add(1);
		astronautsPairsSameCountry.get(3).add(4);
		astronautsPairsSameCountry.get(4).add(3);
		assertEquals(4999949998L,Solution.solve(100000,astronautsPairsSameCountry));
	}
	
}
