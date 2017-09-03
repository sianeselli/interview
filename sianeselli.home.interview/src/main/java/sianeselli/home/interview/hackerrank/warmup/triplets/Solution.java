package sianeselli.home.interview.hackerrank.warmup.triplets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int Ca=0;
        int Cb=0;
        if (a0>b0){
        	Ca++;
        }
        else if (a0<b0){
        	Cb++;
        }
        if (a1>b1){
        	Ca++;
        }
        else if (a1<b1){
        	Cb++;
        }
        if (a2>b2){
        	Ca++;
        }
        else if (a2<b2){
        	Cb++;
        }
    	return new int[]{Ca,Cb};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
