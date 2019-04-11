package com.lsj.basic;


class Outer
{
	int a;
	public void show() {
		System.out.println("In show");
	}
	
	class Inner
	{
		public void display() {
			show();
			System.out.println("In display");
		}
	}
}


public class InnerDemo {
	public static void main(String args[])
	{
		Outer obj = new Outer();
//		obj.show();
		
		Outer.Inner inner = obj.new Inner();
		inner.display();
	}
}
