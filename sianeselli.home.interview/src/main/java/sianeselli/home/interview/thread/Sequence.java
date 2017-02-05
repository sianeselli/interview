package sianeselli.home.interview.thread;

import java.util.ArrayList;
import java.util.List;


public class Sequence {
	
	private String string1;
	private String string2;
	private List<String> patterns;
	private Integer occurences;
	
	
	public Sequence(String string1, String string2, Integer occurences) {
		super();
		this.string1 = string1;
		this.string2 = string2;
		this.occurences = occurences;
	}
	
	public Sequence(List<String> patterns, Integer occurences) {
		super();
		this.patterns = patterns;
		this.occurences = occurences;
	}
	
	public String runSequence(){
		Buffer buffer = new Buffer(2);
		Thread thread1 = new Thread(new Job1(string1,occurences,buffer));
		Thread thread2 = new Thread(new Job2(string2,occurences,buffer));
		thread1.start();
		thread2.start();
		//Without this block the current thread will just finish and returns the result as is...so not yet finished!!!
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return buffer.getBuffer().toString();
	}
	
	public String runSequenceOnList(){
		Buffer buffer = new Buffer(patterns.size());
		List<Thread> threads = new ArrayList<Thread>();
		//Create all Threads
		for (int j=0;j<patterns.size();j++){
			threads.add(new Thread(new Job(patterns.get(j), occurences, buffer,j)));
		}
		//Start them
		for (Thread thread : threads){			
			thread.start();
		}
		//Wait the end of each thread before returning
		for (Thread thread: threads){
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return buffer.getBuffer().toString();
	}
	
}
