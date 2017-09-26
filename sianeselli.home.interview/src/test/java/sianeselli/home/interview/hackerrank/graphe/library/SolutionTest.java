package sianeselli.home.interview.hackerrank.graphe.library;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;


public class SolutionTest {
	
	@Test
	public void test1(){
		int nbreCities=3;
		int nbreRoads=3;
		long cLib=2L;
		long cRoad=1L;
		HashMap<Integer,ArrayList<Integer>> map= new  HashMap<Integer, ArrayList<Integer>>();
        map.put(1, new ArrayList<Integer>());
        map.put(2, new ArrayList<Integer>());
        map.put(3, new ArrayList<Integer>());
        map.get(1).add(2);
        map.get(1).add(3);
        map.get(2).add(1);
        map.get(2).add(3);
        map.get(3).add(2);
        map.get(3).add(1);
		assertEquals(4,Solution.solve(nbreCities,nbreRoads,cLib,cRoad,map));
	}
	
	
	@Test
	public void test2(){
		int nbreCities=6;
		int nbreRoads=6;
		long cLib=2L;
		long cRoad=5L;
		HashMap<Integer,ArrayList<Integer>> map= new  HashMap<Integer, ArrayList<Integer>>();
        map.put(1, new ArrayList<Integer>());
        map.put(2, new ArrayList<Integer>());
        map.put(3, new ArrayList<Integer>());
        map.put(4, new ArrayList<Integer>());
        map.put(5, new ArrayList<Integer>());
        map.put(6, new ArrayList<Integer>());
        map.get(1).add(2);
        map.get(1).add(3);
        map.get(2).add(1);
        map.get(2).add(3);
        map.get(2).add(4);
        map.get(3).add(1);
        map.get(3).add(2);
        map.get(3).add(4);
        map.get(4).add(2);
        map.get(4).add(3);
        map.get(3).add(1);
        map.get(5).add(6);
        map.get(6).add(5);
		assertEquals(12,Solution.solve(nbreCities,nbreRoads,cLib,cRoad,map));
	}
	
	@Test
	public void test3(){
		int nbreCities=6;
		int nbreRoads=6;
		long cLib=5L;
		long cRoad=2L;
		HashMap<Integer,ArrayList<Integer>> map= new  HashMap<Integer, ArrayList<Integer>>();
        map.put(1, new ArrayList<Integer>());
        map.put(2, new ArrayList<Integer>());
        map.put(3, new ArrayList<Integer>());
        map.put(4, new ArrayList<Integer>());
        map.put(5, new ArrayList<Integer>());
        map.put(6, new ArrayList<Integer>());
        map.get(1).add(2);
        map.get(1).add(3);
        map.get(2).add(1);
        map.get(2).add(3);
        map.get(2).add(4);
        map.get(3).add(1);
        map.get(3).add(2);
        map.get(3).add(4);
        map.get(4).add(2);
        map.get(4).add(3);
        map.get(3).add(1);
        map.get(5).add(6);
        map.get(6).add(5);
		assertEquals(18,Solution.solve(nbreCities,nbreRoads,cLib,cRoad,map));
	}
	
}
