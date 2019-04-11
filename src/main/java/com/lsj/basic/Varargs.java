package com.lsj.basic;


public class Varargs 
{

	public static void main(String[] args) 
	{
		
		Calculator calculator = new Calculator();
		int sum = calculator.add(1,2,3,4);
		System.out.println(sum);
	}

}
