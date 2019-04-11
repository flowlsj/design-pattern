package com.lsj.basic;

class Printer
{
	public void show(Number i)
	{
		System.out.println("In show(Number i)");
		System.out.println(i);
	}
	
	public void show(int i) {
		System.out.println("In show(int i)");
		System.out.println(i);
	}
}

public class OverloadDemo {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
		printer.show(4);
		printer.show(4.4);
	}

}
