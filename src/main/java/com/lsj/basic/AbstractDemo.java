package com.lsj.basic;;

abstract class Human
{
	public abstract void eat();
}

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

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		printer.show(4);
		printer.show(4.4);
	}

}
