package sianeselli.home.interview.thread;


public abstract class JobAbstract {

	protected String pattern;
	protected Integer occurences;
	protected Buffer buffer;
	

	public JobAbstract(String pattern, Integer occurences, Buffer buffer) {
		super();
		this.buffer = buffer;
		this.pattern = pattern;
		this.occurences = occurences;
	}
	
	public void run(){
	for (int i=0;i<occurences;i++){
		synchronized (buffer) {
			while(!isMyTurn(buffer)){
				try {
					buffer.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			buffer.getBuffer().append(pattern);
			buffer.flipTurn();
			buffer.notifyAll();
		}
	}
	}
	
	
	public abstract boolean isMyTurn(Buffer buffer);

}
