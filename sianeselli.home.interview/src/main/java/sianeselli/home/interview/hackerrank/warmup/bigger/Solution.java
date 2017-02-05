package sianeselli.home.interview.hackerrank.warmup.bigger;

import java.io.*;
import java.util.*;

public class Solution {

	public String runAlgo(String word) {
		char[] wordInChar = word.toCharArray();
		String newWord = word;
		for (int i = wordInChar.length - 1; i >= 1; i--) {
			String tail = word.substring(i);
			String head = word.substring(0, i);
			char firstOfTail = tail.charAt(0);
			char lastOfHead = head.charAt(head.length() - 1);
			if (firstOfTail > lastOfHead) {
				String newTail = String.valueOf(lastOfHead);
				if (tail.length() > 1) {
					newTail = retrieveMin(newTail + tail);
				}
				String newHead = "";
				if (head.length() > 1) {
					newHead = head.substring(0, head.length() - 1);
				}
				newWord = newHead + newTail;
				break;
			}
		}
		String answer = "no answer";
		if (!newWord.equals(word)) {
			answer = newWord;
		}
		return answer;
	}

	private String retrieveMin(String tail) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		for (char c : tail.toCharArray()) {
			String key = String.valueOf(c);
			String value = key;
			String previousValue = treeMap.get(key);
			if (previousValue != null) {
				value = previousValue + key;
			}
			treeMap.put(key, value);
		}
		StringBuffer newWordBuffer = new StringBuffer();
		while (!treeMap.isEmpty()) {
			newWordBuffer.append(treeMap.pollLastEntry().getValue());
		}
		return newWordBuffer.reverse().toString();
	}

	public static void main(String[] args) {
		final List<String> listInputValues = retrieveInputValues();
		final List<String> listAnswers = new ArrayList<String>();
		Solution solution = new Solution();
		solution.findSolutions(listInputValues, listAnswers);
		publishResult(listAnswers);
	}

	public void findSolutions(List<String> listInputValues,
			List<String> listAnswers) {
		for (String w : listInputValues) {
			listAnswers.add(runAlgo(w));
		}
	}

	private static void publishResult(List<String> listAnswers) {
		for (String answer : listAnswers) {
			System.out.println(answer);
		}
	}

	static List<String> retrieveInputValues() {
		List<String> listValues = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String read = br.readLine();
			Integer size = Integer.valueOf(read);
			for (int i = 0; i < size; i++) {
				read = br.readLine();
				listValues.add(read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return listValues;
	}

}
