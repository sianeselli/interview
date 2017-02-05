package sianeselli.home.interview.hackerrank.warmup.finddigit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * You are given a number N, you need to print the number of positions where
 * digits exactly divides N
 * 
 * 
 * @author Sylvain
 * 
 */
public class Solution {

	public Integer runAlgo(Integer n) {
		Integer result = 0;
		String[] splitted = Integer.toString(n).split("");
		String[] splitted2 = Arrays.copyOfRange(splitted, 1, splitted.length);
		for (String s : splitted2) {
			int intValue = Integer.valueOf(s);
			if (intValue != 0 && n % intValue == 0) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		final List<Integer> listInputValues = retrieveInputValues();
		final List<Integer> listAnswers = new ArrayList<Integer>();
		Solution solution = new Solution();
		solution.findSolutions(listInputValues, listAnswers);
		publishResult(listAnswers);
	}

	public void findSolutions(List<Integer> listInputValues,
			List<Integer> listAnswers) {
		for (Integer nbCycle : listInputValues) {
			listAnswers.add(runAlgo(nbCycle));
		}
	}

	private static void publishResult(List<Integer> listAnswers) {
		for (Integer answer : listAnswers) {
			System.out.println(answer);
		}
	}

	static List<Integer> retrieveInputValues() {
		List<Integer> listValues = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String read = br.readLine();
			Integer size = Integer.valueOf(read);
			for (int i = 0; i < size; i++) {
				read = br.readLine();
				Integer value = Integer.valueOf(read);
				listValues.add(value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return listValues;
	}

}
