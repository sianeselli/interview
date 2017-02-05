package sianeselli.home.interview.thread;


public class Job2 extends JobAbstract implements Runnable {
	

	public Job2(String pattern, Integer occurences,Buffer buffer) {
		super(pattern, occurences,buffer);
	}

	@Override
	public boolean isMyTurn(Buffer buffer) {
		return buffer.isMyTurn(1);
	}

}
