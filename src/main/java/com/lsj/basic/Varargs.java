package com.lsj.basic;

class Calculator 
{
	public int add(int i, int j) 
	{
		System.out.println("In add(int i, int j)");
		return i + j;
	}
	
	public int add(int ...i)
	{
		System.out.println("In add(int ...i)");
		int sum = 0;
		for(int j : i)
		{
			sum += j;
		}
		return sum;
	}
}

public class Varargs 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		int sum = calculator.add(1,2,3,4);
		System.out.println(sum);
	}

}
