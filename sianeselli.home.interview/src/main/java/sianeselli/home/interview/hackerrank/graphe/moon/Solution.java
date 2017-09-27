package sianeselli.home.interview.hackerrank.graphe.moon;

import java.util.*;

public class Solution {


	static int solve(int n,HashMap<Integer,ArrayList<Integer>> astronautsPairsSameCountry ){
		int nbrePairs=0;
		for (int astronaut=0;astronaut<n;astronaut++){
			nbrePairs+=lookForPair(n,astronautsPairsSameCountry, astronaut);
		}
	    return nbrePairs/2;
	}

    private static int lookForPair(int n, HashMap<Integer, ArrayList<Integer>> astronautsPairsSameCountry,
			int astronaut) {
    	int nbrePair = 0;
    	HashMap<Integer,Boolean> astronautsMarked= new  HashMap<Integer, Boolean>();
    	for (int i=0;i<n;i++)
    		astronautsMarked.put(i, false);
    	lookForSimilarCountry(astronaut,astronautsPairsSameCountry,astronautsMarked);
    	for (int i=0;i<n;i++) {
    		if (!astronautsMarked.get(i)) {
    			nbrePair++;
    		}
    	}
		return nbrePair;
	}

	private static void lookForSimilarCountry(int n, HashMap<Integer, ArrayList<Integer>> astronautsPairsSameCountry,
			HashMap<Integer, Boolean> astronautsMarked) {
		astronautsMarked.put(n, true);
		for (int astronaut : astronautsPairsSameCountry.get(n)){
			if (!astronautsMarked.get(astronaut)){
				lookForSimilarCountry(astronaut, astronautsPairsSameCountry, astronautsMarked);
			}
		}
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        HashMap<Integer,ArrayList<Integer>> astronautsPairsSameCountry= new  HashMap<Integer, ArrayList<Integer>>();
        for(int i = 0; i < n; i++)
        	astronautsPairsSameCountry.put(i, new ArrayList<Integer>());
        for(int i = 0; i < p; i++){
        	int a = in.nextInt();
            int b = in.nextInt();
            astronautsPairsSameCountry.get(a).add(b);
            astronautsPairsSameCountry.get(b).add(a);
        }
        System.out.println(solve(n,astronautsPairsSameCountry));
    }
}