package sianeselli.home.interview.hackerrank.graphe.kruskal;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.TreeMap;

import org.junit.Test;


public class SolutionTest {
	
	@Test
	public void test1(){
		int nbreNodes=4;
		TreeMap<Integer,ArrayList<String>> graphe= new  TreeMap<Integer, ArrayList<String>>();
        for (int i=3;i<=7;i++){
        	graphe.put(i, new ArrayList<String>());
        }
		graphe.get(5).add("1-2");
		graphe.get(3).add("1-3");
		graphe.get(6).add("4-1");
		graphe.get(7).add("2-4");
		graphe.get(4).add("3-2");
		graphe.get(5).add("3-4");
		int actual = Solution.solve(nbreNodes,graphe);
		int expected = 12;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2(){
		int nbreNodes=4;
		TreeMap<Integer,ArrayList<String>> graphe= new  TreeMap<Integer, ArrayList<String>>();
        for (int i=3;i<=7;i++){
        	graphe.put(i, new ArrayList<String>());
        }
		graphe.get(5).add("1-2");
		graphe.get(3).add("1-3");
		graphe.get(6).add("4-1");
		graphe.get(7).add("2-4");
		graphe.get(4).add("3-2");
		graphe.get(5).add("3-4");
		int actual = Solution.solve(nbreNodes,graphe);
		int expected = 12;
		assertEquals(expected, actual);
	}
	

}
