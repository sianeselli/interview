package sianeselli.home.interview.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public abstract class AbstractStringHackerRankTest extends
		AbstractHackerRankTest<String> {

	protected void fillInList(List<String> list, BufferedReader br, Integer size)
			throws IOException {
		String read;
		for (int i = 0; i < size; i++) {
			read = br.readLine();
			list.add(read);
		}
	}

}
