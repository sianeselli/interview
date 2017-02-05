package sianeselli.home.interview.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public abstract class AbstractIntegerHackerRankTest extends
		AbstractHackerRankTest<Integer> {

	protected void fillInList(List<Integer> list, BufferedReader br,
			Integer size) throws IOException {
		String read;
		for (int i = 0; i < size; i++) {
			read = br.readLine();
			Integer value = Integer.valueOf(read);
			list.add(value);
		}
	}

}
