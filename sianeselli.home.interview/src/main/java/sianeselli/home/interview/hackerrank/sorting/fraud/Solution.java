package sianeselli.home.interview.hackerrank.sorting.fraud;


import java.io.*;
import java.util.*;

public class Solution {
	
	private static int medianIndex = 0;
	private static float medianValue = 0f;
	private static boolean isOddSize = false;
	private static LinkedList<Integer> history=new LinkedList<Integer>();
	private static LinkedList<Integer> sortedHistory=new LinkedList<Integer>();

    static int activityNotifications(int[] expenditure, int d) {
        int nbNotif = 0; 
        initMedian(d);
        initHistory(expenditure,d);
        updateMedianValue();
        for (int j=d;j<expenditure.length;j++){
        	int expenseOfTheDay=expenditure[j];
        	float expenseOfTheDayF=new Integer(expenseOfTheDay).floatValue();
        	if (expenseOfTheDayF>=2*medianValue){
        		nbNotif++;
        	}
        	updateHistory(expenseOfTheDay);
        	updateMedianValue();
        }
    	return nbNotif;
    }

    private static void updateMedianValue() {
		if (isOddSize){
			medianValue = sortedHistory.get(medianIndex).floatValue();
		}
		else {
			medianValue = ((float) sortedHistory.get(medianIndex).floatValue() + (float) sortedHistory.get(medianIndex-1).floatValue())/2f;
		}
	}

	private static void initMedian(int d) {
    	isOddSize = !((d%2)==0);
    	medianIndex=d/2;
	}

	private static void initHistory(int[] expenditure, int d) {
    	history.clear();
    	sortedHistory.clear();
		for (int i=0;i<d;i++){
    		history.offerLast(expenditure[i]);
    	}
		for (int j=0;j<d;j++){
    		insertToSortedHistory(expenditure[j]);
    	}
    }
    
	private static void updateHistory(int expenseOfTheDay) {
		int oldestExpense= history.pollFirst();
		history.offerLast(Integer.valueOf(expenseOfTheDay));
			insertToSortedHistory(expenseOfTheDay);
			int indexToRemove = sortedHistory.indexOf(oldestExpense);
			if (indexToRemove != -1){
				sortedHistory.remove(indexToRemove);			
		}
	}


    private static void insertToSortedHistory(int expenseOfTheDay) {
		if (sortedHistory.isEmpty()){
			sortedHistory.offerLast(expenseOfTheDay);
		}
		else {
    		//New element
    		if (sortedHistory.peekLast()<=expenseOfTheDay){
    			sortedHistory.offerLast(expenseOfTheDay);
    		}
    		else {
    			int index=0;
    			if (expenseOfTheDay>=medianValue){
    				index=medianIndex;
    				if (!isOddSize && index !=0 ){
    					index--;
    				}	
    			}
    			while (sortedHistory.get(index)<expenseOfTheDay && index < sortedHistory.size()){
    				index++;
    			}
    			sortedHistory.add(index, expenseOfTheDay);
    		}
		}		
	}


	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] expenditure = new int[n];
        for(int expenditure_i = 0; expenditure_i < n; expenditure_i++){
            expenditure[expenditure_i] = in.nextInt();
        }
        int result = activityNotifications(expenditure, d);
        System.out.println(result);
        in.close();
    }
}

