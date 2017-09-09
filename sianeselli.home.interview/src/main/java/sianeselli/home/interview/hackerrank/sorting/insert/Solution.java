package sianeselli.home.interview.hackerrank.sorting.insert;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static void insertIntoSorted(int[] ar) {
    	if(ar.length>1){    		
    		int lastIndex = ar.length-1;
    		int e = ar[lastIndex];
    		for (int prevIndex=lastIndex-1;prevIndex>=0;prevIndex--){
    			if (ar[prevIndex]<e) {
    				ar[prevIndex+1]=e;
    				//printArray(ar);
    				return;
    			}
    			else {
    				ar[prevIndex+1]=ar[prevIndex];
    				//printArray(ar);
    			}
    		}
    		//if we reach this point it means we have to place e in the 1st cell
    		ar[0]=e;
    		//printArray(ar);
    	}
        
    }
    
    public static void insertionSortPart2(int[] ar)
    {          
    	if(ar.length >1){
        	   for (int tmpLength=2;tmpLength<=ar.length;tmpLength++){
        		   int[] tmpArray = Arrays.copyOf(ar, tmpLength);
        		   insertIntoSorted(tmpArray);
        		   for (int i=0; i<tmpLength;i++){
        			   ar[i]=tmpArray[i];
        		   }
        		   printArray(ar);
        	   }
        }
    }  
    
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
