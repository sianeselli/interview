package sianeselli.home.interview.thread;

import java.util.concurrent.TimeUnit;

public class StopTest {
	
	private static boolean stopRequested;
	
	private static synchronized boolean stopRequested(){
		return stopRequested;
	}
	
	private static synchronized void requestStop(){
		stopRequested= true;
	}
	
	public static void main (String[] args) throws InterruptedException{
		Thread bgThread = new Thread (new Runnable(
				) {
			
			public void run() {
				int i=0;
				while (!stopRequested()){
					System.out.println("Let me run!! " + ++i);
				}
			}
		});
		bgThread.start();
		TimeUnit.MILLISECONDS.sleep(1);
		requestStop();
	}

}
