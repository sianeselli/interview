package sianeselli.home.interview.hackerrank.contestnov;

import java.io.*;
import java.util.*;

public class SolutionD1 {

	public Integer runAlgo(List<Integer> listInputValues) {
		Integer answer = null;
		return answer;
	}

	public static void main(String[] args) {
		final List<Integer> listInputValues = retrieveInputValues();
		final List<Integer> listAnswers = new ArrayList<Integer>();
		SolutionD1 solution = new SolutionD1();
		solution.findSolution(listInputValues, listAnswers);
		publishResult(listAnswers);
	}

	public void findSolution(List<Integer> listInputValues,
			List<Integer> listAnswers) {
		listAnswers.add(runAlgo(listInputValues));
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
			read = br.readLine();
			String[] readSplitted = read.split(" ");
			for (int i = 0; i < size; i++) {
				listValues.add(Integer.valueOf(readSplitted[i]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return listValues;
	}

}
