package sianeselli.home.interview.hackerrank.sorting.quicksort;


import java.io.*;
import java.util.*;

public class Solution {

    public static ArrayList<Integer> quickSort(int[] A){
        ArrayList<Integer> left=new ArrayList<Integer>();
        ArrayList<Integer> right=new ArrayList<Integer>();
        ArrayList<Integer> equal=new ArrayList<Integer>();
    	int p=A[0];
        for(Integer current : A){
        	if (current<p){
            	left.add(current);	
            }
            else if (current>p){
            	right.add(current);
            }
            else {
            	equal.add(current);
            }
            
        }
        equal.addAll(right);
        left.addAll(equal);
        printArray(left);
        return left;
    }


    static void printArray(ArrayList<Integer> ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        quickSort(ar);
    }
}

