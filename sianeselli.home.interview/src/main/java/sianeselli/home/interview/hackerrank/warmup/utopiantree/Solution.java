package sianeselli.home.interview.hackerrank.warmup.utopiantree;

import java.io.*;
import java.util.*;

public class Solution {

	public Integer runAlgo(Integer nbCycle) {
		Integer height = 1;
		for (int currentCycle = 1; currentCycle <= nbCycle; currentCycle++) {
			if (currentCycle % 2 == 1) {
				height = height * 2;
			} else {
				height += 1;
			}
		}
		return height;
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
