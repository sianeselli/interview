package sianeselli.home.interview.hackerrank.graphe.bfs;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;


public class SolutionTest {
	
	@Test
	public void test1(){
		int nbreNodes=4;
		int startingNode=1;
		HashMap<Integer,ArrayList<Integer>> graphe= new  HashMap<Integer, ArrayList<Integer>>();
        for (int i=1;i<=nbreNodes;i++){
        	graphe.put(i, new ArrayList<Integer>());
        }
		graphe.get(1).add(2);
		graphe.get(1).add(3);
		int[] actual = Solution.solve(nbreNodes,graphe,startingNode);
		int[] expected = new int[]{6,6,-1};
		assertArrayEquals(expected, actual);
	}
	
	
	@Test
	public void test2(){
		int nbreNodes=3;
		int startingNode=2;
		HashMap<Integer,ArrayList<Integer>> graphe= new  HashMap<Integer, ArrayList<Integer>>();
        for (int i=1;i<=nbreNodes;i++){
        	graphe.put(i, new ArrayList<Integer>());
        }
		graphe.get(2).add(3);
		int[] actual = Solution.solve(nbreNodes,graphe,startingNode);
		int[] expected = new int[]{-1,6};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test3(){
		int nbreNodes=5;
		int startingNode=2;
		HashMap<Integer,ArrayList<Integer>> graphe= new  HashMap<Integer, ArrayList<Integer>>();
        for (int i=1;i<=nbreNodes;i++){
        	graphe.put(i, new ArrayList<Integer>());
        }
        graphe.get(1).add(3);
        graphe.get(1).add(4);
		graphe.get(2).add(1);
		graphe.get(2).add(3);
		int[] actual = Solution.solve(nbreNodes,graphe,startingNode);
		int[] expected = new int[]{6,6,12,-1};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test4(){
		int nbreNodes=6;
		int startingNode=2;
		HashMap<Integer,ArrayList<Integer>> graphe= new  HashMap<Integer, ArrayList<Integer>>();
        for (int i=1;i<=nbreNodes;i++){
        	graphe.put(i, new ArrayList<Integer>());
        }
        graphe.get(1).add(3);
        graphe.get(1).add(4);
		graphe.get(2).add(1);
		graphe.get(2).add(3);
		graphe.get(4).add(6);
		graphe.get(2).add(5);
		int[] actual = Solution.solve(nbreNodes,graphe,startingNode);
		int[] expected = new int[]{6,6,12,6,18};
		assertArrayEquals(expected, actual);
	}
	
}
