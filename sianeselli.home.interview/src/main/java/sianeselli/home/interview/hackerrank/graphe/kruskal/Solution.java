package sianeselli.home.interview.hackerrank.graphe.kruskal;

import java.util.*;
import java.util.Map.Entry;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        TreeMap<Integer,ArrayList<String>> graph= new  TreeMap<Integer, ArrayList<String>>();
        for(int a0 = 0; a0 < m; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int r = in.nextInt();
            if (graph.get(r) == null){
            	graph.put(r, new ArrayList<String>());
            }
            graph.get(r).add(String.valueOf(x)+"-"+String.valueOf(y));
        }
        System.out.println(solve(n,graph));
    }

	static int solve(int nbreNode, TreeMap<Integer, ArrayList<String>> graph) {
		HashMap<String,Boolean> markedNodes = new HashMap<String, Boolean>(); 
		initMarkedNodes(nbreNode,markedNodes);
		int res = runAlgo(graph,markedNodes);
		return res;
	}

	private static int runAlgo(TreeMap<Integer, ArrayList<String>> graph, HashMap<String, Boolean> markedNodes) {
		int sum = 0;
		while (!graph.isEmpty()){
			Entry<Integer, ArrayList<String>> entry=graph.pollFirstEntry();
			Integer weight = entry.getKey();
			ArrayList<String> listEdges=entry.getValue();
			for (String edge:listEdges){
				String[] nodes = edge.split("-");
				if (! (markedNodes.get(nodes[0]) && markedNodes.get(nodes[1]))){
					//System.out.println(edge);
					sum+=weight;
					markedNodes.put(nodes[0],true);
					markedNodes.put(nodes[1],true);
				}
			}		
		}
		return sum;
	}

	private static void initMarkedNodes(int nbreNode, HashMap<String, Boolean> markedNodes) {
		for(int i=1;i<=nbreNode;i++){
			markedNodes.put(String.valueOf(i), false);
		}
	}
}