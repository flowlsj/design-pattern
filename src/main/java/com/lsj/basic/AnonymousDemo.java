package com.lsj.basic;

@FunctionalInterface
interface Sigle
{
	void show();
	default void test() {
		System.out.println("default method in functional interface");
	}
}

public class AnonymousDemo {
	public static void main(String[] args) {
		
		A a = new A() {
			@Override
			public void show() {
				System.out.println("In anonymous class extends A");
			}
		};
		a.show();
		
		Sigle s = () -> {
			System.out.println("In lambda expression");
		};
		s.show();
		s.test();
	}
}
