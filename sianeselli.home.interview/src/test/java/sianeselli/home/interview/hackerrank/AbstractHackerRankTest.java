package sianeselli.home.interview.hackerrank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHackerRankTest<T> {

	protected static final String COMMON_PATH = "C:\\dev\\java\\eclipse\\workspace\\homework\\interview\\src\\test\\resources\\sianeselli\\home\\interview\\hackerrank\\";

	protected List<T> listInputValues = new ArrayList<T>();
	protected List<T> actualListAnswers = new ArrayList<T>();
	protected List<T> expectedListAnswers = new ArrayList<T>();

	protected void init() {
		actualListAnswers.clear();
		expectedListAnswers.clear();
		listInputValues.clear();
	}

	protected void prepareTestData(String specificPath, String pbFileName,
			String solFileName) {
		readFile(listInputValues, specificPath, pbFileName);
		readFile(expectedListAnswers, specificPath, solFileName);
	}

	private void readFile(List<T> list, String specificPath, String pbFileName) {
		try {
			FileInputStream inputstream = new FileInputStream(COMMON_PATH
					+ specificPath + pbFileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					inputstream));
			String read = br.readLine();
			Integer size = Integer.valueOf(read);
			fillInList(list, br, size);
			inputstream.close();
		} catch (FileNotFoundException e) {
			fail();
		} catch (IOException e) {
			fail();
		}
	}

	protected abstract void fillInList(List<T> list, BufferedReader br,
			Integer size) throws IOException;

	protected void validateResult() {
		assertEquals(expectedListAnswers.size(), actualListAnswers.size());
		int index = 0;
		for (T actualValue : actualListAnswers) {
			assertEquals("Error test: " + index,
					expectedListAnswers.get(index++), actualValue);
		}
	}
}
