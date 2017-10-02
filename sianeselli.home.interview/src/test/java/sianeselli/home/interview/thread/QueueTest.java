package sianeselli.home.interview.thread;

import java.util.concurrent.Semaphore;

import org.junit.Test;

public class QueueTest {
	
	public static Semaphore sem = new Semaphore(1);
	
	@Test
	public void test1(){
		
		Runnable job1 = new Runnable() {
			public void run() {
				Integer elt = null;
				while (elt == null){					
					System.out.println("Consume integer from queue.");
					elt = ConcurrentCollection.consume();
				}
				System.out.println("Consumed integer from queue: " + elt);
			}
		};
		
		Runnable job2 = new Runnable() {
			public void run() {
				System.out.println("Add element to the queue.");
				ConcurrentCollection.post(2);
				System.out.println("Element added.");
			}
		};
		
		Thread t1 = new Thread(job1);
		Thread t2 = new Thread(job2);
		
		t1.start();
		try {
			t2.start();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2(){
		
		Runnable job1 = new Runnable() {
			public void run() {
				Integer elt = null;
				while (elt == null){					
					System.out.println(Thread.currentThread().getName() + "Ask for Semaphore sem : " + sem.availablePermits());
					try {
						sem.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "I got the Semaphore sem : " + sem.availablePermits());
					System.out.println("Consume integer from queue.");
					elt = ConcurrentCollection.consume();
					sem.release();
					System.out.println(Thread.currentThread().getName() + "I release the Semaphore sem : " + sem.availablePermits());
				}
				System.out.println("Consumed integer from queue: " + elt);
			}
		};
		
		Runnable job2 = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "Ask for Semaphore sem : " + sem.availablePermits());
				try {
					sem.acquire();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "I got the Semaphore sem : " + sem.availablePermits());
				System.out.println("Add element to the queue.");
				ConcurrentCollection.post(2);
				System.out.println("Element added.");
				sem.release();
				System.out.println(Thread.currentThread().getName() + "I release the Semaphore sem : " + sem.availablePermits());
			}
		};
		
		Thread t1 = new Thread(job1);
		t1.setName("JOB1");
		Thread t2 = new Thread(job2);
		t2.setName("JOB2");
		
		t1.start();
		try {
			t2.start();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
