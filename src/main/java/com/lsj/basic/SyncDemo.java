package com.lsj.basic;

class Counter
{
	int count;
	public synchronized void increment() {
		count++;
	}
}

public class SyncDemo {
	public static void main(String[] args) throws Exception{
		Counter counter = new Counter();
		
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 10000; i++)
				counter.increment();
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 10000; i++)
				counter.increment();
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count: " + counter.count);
	}
}
