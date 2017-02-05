package sianeselli.home.interview.thread;


public class Job extends JobAbstract implements Runnable {

	private Integer jobNumber;

	public Job(String pattern, Integer occurences, Buffer buffer) {
		super(pattern, occurences, buffer);
	}
	
	public Job(String pattern, Integer occurences, Buffer buffer, Integer jobNumber) {
		super(pattern, occurences, buffer);
		this.jobNumber = jobNumber;
	}

	@Override
	public boolean isMyTurn(Buffer buffer) {
		return buffer.isMyTurn(this.jobNumber);
	}
	
}
