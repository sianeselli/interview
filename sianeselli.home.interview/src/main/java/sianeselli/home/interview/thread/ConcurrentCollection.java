package sianeselli.home.interview.thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentCollection {
	
	private static ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
	
	private static ConcurrentHashMap<Integer, Boolean> map = new ConcurrentHashMap<Integer, Boolean>();
	
	public static void post(Integer i){
		queue.offer(i);
	}
	
	public static Integer consume(){
		return queue.poll();
	}
	
	public static void add(Integer i){
		map.putIfAbsent(i, false);
	}
	
}
