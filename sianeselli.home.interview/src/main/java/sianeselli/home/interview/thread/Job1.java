package sianeselli.home.interview.thread;


public class Job1 extends JobAbstract implements Runnable {


	public Job1(String pattern, Integer occurences, Buffer buffer) {
		super(pattern, occurences, buffer);
	}

	@Override
	public boolean isMyTurn(Buffer buffer) {
		return buffer.isMyTurn(0);
	}
	
}
