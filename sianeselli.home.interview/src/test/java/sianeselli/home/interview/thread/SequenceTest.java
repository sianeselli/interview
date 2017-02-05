package sianeselli.home.interview.thread;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class SequenceTest {
	
	@Test
	public void simple(){
		String actual = new Sequence("a", "b", 3).runSequence();
		Assert.assertEquals("ababab", actual);
	}
	
	@Test
	public void simpleList(){
		List<String> patterns = new ArrayList<String>();
		patterns.add("a");
		patterns.add("b");
		String actual = new Sequence(patterns, 3).runSequenceOnList();
		Assert.assertEquals("ababab", actual);
	}
	
	@Test
	public void complex2(){
		String actual = new Sequence("aaaa", "aaab", 2).runSequence();
		Assert.assertEquals("aaaaaaabaaaaaaab", actual);
	}
	
	@Test
	public void complex(){
		String actual = new Sequence("Mathilde-", "Sylvain ", 2).runSequence();
		Assert.assertEquals("Mathilde-Sylvain Mathilde-Sylvain ", actual);
	}
	
	@Test
	public void complexList(){
		List<String> patterns = new ArrayList<String>();
		patterns.add("a");
		patterns.add("b");
		patterns.add("b");
		patterns.add("c");
		patterns.add("d");
		patterns.add("-");
		String actual = new Sequence(patterns, 4).runSequenceOnList();
		Assert.assertEquals("abbcd-abbcd-abbcd-abbcd-", actual);
	}

}
