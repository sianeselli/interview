package sianeselli.home.interview.hackerrank.sorting.fraud;


import java.io.*;
import java.util.*;

public class Solution {

    static int activityNotifications(int[] expenditure, int d) {
        int nbNotif = 0;
        LinkedList<Integer> history=new LinkedList<Integer>();
        LinkedList<Integer> sortedHistory=new LinkedList<Integer>();
        initHistory(expenditure, d,history,sortedHistory);
        for (int j=d;j<expenditure.length;j++){
        	int median=getMedian(sortedHistory);
        	int expenseDay=expenditure[j];
        	if (expenseDay>=2*median){
        		nbNotif++;
        	}
        	updateHistory(history, sortedHistory,expenseDay);
        }
    	return nbNotif;
    }

    private static void initHistory(int[] expenditure, int d, LinkedList<Integer> history, LinkedList<Integer> sortedHistory) {
    	for (int i=0;i<d;i++){
    		history.offerLast(expenditure[i]);
    		insertToSortedList(expenditure[i],sortedHistory);
    	}
    }
    
	private static void updateHistory(LinkedList<Integer> history, LinkedList<Integer> sortedHistory, int expenseDay) {
		int oldestExpense = history.pollFirst();
		history.offerLast(expenseDay);
		if (oldestExpense != expenseDay){
			sortedHistory.remove(sortedHistory.indexOf(oldestExpense));
			insertToSortedList(expenseDay,sortedHistory);
		}
	}


    private static void insertToSortedList(int expense, LinkedList<Integer> sortedHistory) {
		if (sortedHistory.isEmpty()){
			sortedHistory.offerLast(expense);
		}
		else {
    		//New element
    		if (sortedHistory.peekLast()<expense){
    			sortedHistory.offerLast(expense);
    		}
    		else {
    			int index2=0;
    			while (sortedHistory.get(index2)<expense){
    				index2++;
    			}
    			sortedHistory.add(index2, expense);
    		}
		}		
	}

	private static int getMedian(LinkedList<Integer> sortedHistory) {
		int median = 0;
		int listLength = sortedHistory.size();
		if (listLength%2==0){
			median = (sortedHistory.get(listLength/2)+sortedHistory.get(listLength/2+1))/2;
		}
		else {
			median = sortedHistory.get(listLength/2+1);
		}
		return median;
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

