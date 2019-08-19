package com.lsj.basic;

class Hi extends Thread
{
	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Hello extends Thread
{
	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Hi2 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			System.out.println("Hi2");
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Hello2 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			System.out.println("Hello2");
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		obj1.start();
		obj2.start();
		
		Thread hi2 = new Thread(new Hi2());
		Thread hello2 = new Thread(new Hello2());
		hi2.start();
		hello2.start();
	}

}
