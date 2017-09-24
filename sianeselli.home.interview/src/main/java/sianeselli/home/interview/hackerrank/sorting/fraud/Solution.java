package sianeselli.home.interview.hackerrank.sorting.fraud;


import java.util.*;

public class Solution {
	
	private static int medianIndex = 0;
	private static float medianValue = 0f;
	private static boolean isOddSize = false;
	private static LinkedList<Integer> history=new LinkedList<Integer>();
	private static TreeMap<Integer, Integer> sortedHistory = new TreeMap<Integer, Integer>();

    static int activityNotifications(int[] expenditure, int d) {
        int nbNotif = 0; 
        initMedian(d);
        initHistory(expenditure,d);
        initSortedHistory(expenditure,d);
        updateMedianValue();
        for (int j=d;j<expenditure.length;j++){
        	int expenseOfTheDay=expenditure[j];
        	if (expenseOfTheDay>=2*medianValue){
        		nbNotif++;
        	}
        	Integer oldestExpense = updateHistory(expenseOfTheDay);
        	updateSortedHistory(oldestExpense, expenseOfTheDay);
        	updateMedianValue();
        }
    	return nbNotif;
    }

    private static void initMedian(int d) {
    	isOddSize = !((d%2)==0);
    	medianIndex=d/2;
    }
    
    private static void initHistory(int[] expenditure, int d) {
    	history.clear();
    	for (int i=0;i<d;i++){
    		history.offerLast(expenditure[i]);
    	}
    }
    
    private static void initSortedHistory(int[] expenditure, int d) {
		sortedHistory.clear();
		for (int i=0;i<d;i++){
			int exp=expenditure[i];
			Integer nbrOccurence=0;
			if (sortedHistory.containsKey(exp)){
				nbrOccurence=sortedHistory.get(exp);
			}
			nbrOccurence++;
			sortedHistory.put(exp, nbrOccurence);
		}
	}

	private static void updateMedianValue() {
		int count=0;
		for (Integer key : sortedHistory.keySet()){
			count +=sortedHistory.get(key);
			if (count>medianIndex) {					
				medianValue=key;
				break;
			}
			else if (count == medianIndex){
				if (isOddSize){
					medianValue=key;
					break;
				}
				else {
					medianValue=(key.floatValue() + sortedHistory.higherKey(key).floatValue())/2;
					break;
				}
			}
		}	
	}
    
	private static Integer updateHistory(int expenseOfTheDay) {
		history.offerLast(expenseOfTheDay);
		return history.pollFirst();
	}
	
	private static void updateSortedHistory(int oldestExpense,int expenseOfTheDay) {
		sortedHistory.put(oldestExpense, sortedHistory.get(oldestExpense)-1);
		if (sortedHistory.containsKey(expenseOfTheDay)){
			sortedHistory.put(expenseOfTheDay, sortedHistory.get(expenseOfTheDay)+1);
		}
		else {
			sortedHistory.put(expenseOfTheDay, 1);
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

