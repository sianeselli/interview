package sianeselli.home.interview.hackerrank.sorting.lilyhomework;


import java.io.*;
import java.util.*;

import javax.print.attribute.standard.PrinterLocation;

public class Solution {

    public static int solveLilyHomework(int[] A){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<A.length;i++){
        	map.put(A[i], i);
        }
        return Math.min(nbSwap(A.clone(), sort(A), map),nbSwap(A.clone(), reverseSort(A), map));
    }

	private static int nbSwap(int[] A, int[] sorted_A, HashMap<Integer, Integer> map) {
		 int nbSwap=0;
		for (int k=0;k<sorted_A.length;k++){
        	int sortedCurrentValue =sorted_A[k];
        	int currentValue = A[k];
        	if (sortedCurrentValue != currentValue) {
        		nbSwap++;
        		int indexSortedCurrentValue = map.get(sortedCurrentValue);
        		A[indexSortedCurrentValue]=currentValue;
        		A[k]=sortedCurrentValue;
        		map.put(currentValue, indexSortedCurrentValue);
        		map.put(sortedCurrentValue, k);
        	}
        }
		return nbSwap;
	}
    
    public static int[] sort(int[] A){
    	int[] b=A.clone();
    	Arrays.sort(b);
    	return b;
    }
    
    public static int[] reverseSort(int[] A){
    	int[] b=A.clone();
    	Arrays.sort(b);
    	for (int start=0, end = b.length-1;start<=end;start++,end--){
    		int aux=b[start];
    		b[start]=b[end];
    		b[end]=aux;
    	}
    	return b;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        System.out.println(solveLilyHomework(ar));
    }
}

