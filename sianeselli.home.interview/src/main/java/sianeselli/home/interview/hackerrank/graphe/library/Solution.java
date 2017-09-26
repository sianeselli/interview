package sianeselli.home.interview.hackerrank.graphe.library;

import java.util.*;

public class Solution {

	static HashMap<Integer,Boolean> nodeMarked = new HashMap<Integer, Boolean>();
	
	static long solve(int nbreCities, int nbreRoads, long cLib, long cRoad,HashMap<Integer,ArrayList<Integer>> map ){
		long minCost=0;
		if (cLib<cRoad){
			minCost=nbreCities*cLib;
		}
		else {
			initNodeMarked(nbreCities);
			int nbreSubNet = 0;
			for (int currentCity = 1;currentCity<=nbreCities;currentCity++){
				if (!nodeMarked.get(currentCity)){
					nodeMarked.put(currentCity, true);
					exploreFrom(currentCity,map);
					nbreSubNet++;
				}
			}
			minCost=nbreSubNet*cLib+(nbreCities-nbreSubNet)*cRoad;
		}
		return minCost;
	}

	private static void exploreFrom(int currentCity,HashMap<Integer,ArrayList<Integer>> map) {
		ArrayList<Integer> adjacentCities = map.get(currentCity);
		for (Integer adjacentCity : adjacentCities){
			if (!nodeMarked.get(adjacentCity)){
				nodeMarked.put(adjacentCity, true);
				exploreFrom(adjacentCity, map);
			}
		}
	}

	private static void initNodeMarked(int nbreCities) {
		nodeMarked.clear();
		for (int i=1;i<=nbreCities;i++){
			nodeMarked.put(i, false);
		}
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            HashMap<Integer,ArrayList<Integer>> map= new  HashMap<Integer, ArrayList<Integer>>();
            for (int i=1;i<=n;i++){
            	map.put(i, new ArrayList<Integer>());
            }
            for(int a1 = 0; a1 < m; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                map.get(city_1).add(city_2);
                map.get(city_2).add(city_1);
            }
            System.out.println(solve(n,m,x,y,map));
        }
    }
}