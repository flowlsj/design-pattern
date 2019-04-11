package com.lsj.basic;


class A
{
	public A() {
		System.out.println("In A()");
	}
	public A(int a) {
		System.out.println("In A(int a)");
	}
	
	public void show() {
		System.out.println("Show() in class A");
	}
}

class B extends A
{
	public B() {
		System.out.println("In B()");
	}
	public B(int a) {
		super(a);
		System.out.println("In B(int a)");
	}
//	public void show() {
//		super.show();
//	}
}

public class SupperDemo {

	public static void main(String[] args) {
		B bDefault = new B();
		bDefault.show();
		
		B bArgument = new B(5);
		bArgument.show();
	}

}
