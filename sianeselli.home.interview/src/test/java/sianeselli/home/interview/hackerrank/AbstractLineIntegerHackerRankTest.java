package sianeselli.home.interview.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class AbstractLineIntegerHackerRankTest  extends
AbstractHackerRankTest<Integer>{

	@Override
	protected void fillInList(List<Integer> list, BufferedReader br,
			Integer size) throws IOException {
		String read = br.readLine();
		String[] readSplitted = read.split(" ");
		for (int i = 0; i < size; i++) {
			list.add(Integer.valueOf(readSplitted[i]));
		}
		
	}

}
