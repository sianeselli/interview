package sianeselli.home.interview.hackerrank.graphe.bfs;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			HashMap<Integer, ArrayList<Integer>> graphe = new HashMap<Integer, ArrayList<Integer>>();
			for (int i = 1; i <= n; i++) {
				graphe.put(i, new ArrayList<Integer>());
			}
			for (int a1 = 0; a1 < m; a1++) {
				int u = in.nextInt();
				int v = in.nextInt();
				graphe.get(u).add(v);
			}
			int s = in.nextInt();
			int[] res = solve(n, graphe, s);
			String resS="";
			for (int i=0;i<n-1;i++){
				resS=resS+res[i]+" ";
			}
			System.out.println(resS);
		}
		in.close();
	}

	static int[] solve(int nbreNode, HashMap<Integer, ArrayList<Integer>> graphe, int startingNode) {
		TreeMap<Integer, Integer> markedNode = new TreeMap<Integer, Integer>();
		initMarkedNode(nbreNode, startingNode, markedNode);
		lookForSons(startingNode, graphe, markedNode);
		return prepareResult(startingNode, nbreNode, markedNode);
	}

	private static int[] prepareResult(int startingNode, int nbreNode, TreeMap<Integer, Integer> markedNode) {
		int[] res = new int[nbreNode - 1];
		int i = 0;
		for (int node : markedNode.keySet()) {
			if (node != startingNode) {
				res[i++] = markedNode.get(node);
			}
		}
		return res;
	}

	private static void lookForSons(int startingNode, HashMap<Integer, ArrayList<Integer>> graphe,
			TreeMap<Integer, Integer> markedNode) {
		LinkedList<Integer> fifo = new LinkedList<Integer>();
		fifo.addLast(startingNode);
		while (!fifo.isEmpty()) {
			int parentNode = fifo.removeFirst();
			for (int node : graphe.get(parentNode)) {
				if (markedNode.get(node) == -1) {
					markedNode.put(node, markedNode.get(parentNode) + 6);
					fifo.addLast(node);
				}
			}
		}
	}

	private static void initMarkedNode(int nbreNode, int startingNode, TreeMap<Integer, Integer> markedNode) {
		for (int node = 1; node <= nbreNode; node++) {
			if (node != startingNode) {
				markedNode.put(node, -1);
			} else {
				markedNode.put(node, 0);
			}
		}
	}
}