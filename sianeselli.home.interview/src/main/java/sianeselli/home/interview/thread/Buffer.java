package sianeselli.home.interview.thread;

public class Buffer {

	private Integer isTurn = 0;
	private Integer numberOfJobs = 2;
	private StringBuffer buffer = new StringBuffer();
	
	public Buffer(Integer numberOfJobs){
		this.numberOfJobs = numberOfJobs;
	}
	
	public boolean isMyTurn(Integer turnNumber){
		return Integer.valueOf(turnNumber).equals(isTurn); 
	}
	
	
	public void flipTurn(){
		this.isTurn = (this.isTurn + 1) % numberOfJobs;
	}
	
	public StringBuffer getBuffer(){
		return this.buffer;
	}
	
}
