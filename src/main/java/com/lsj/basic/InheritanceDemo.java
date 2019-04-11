package com.lsj.basic;

class CalculatorPlus extends Calculator
{
	public int sub(int i, int j)
	{
		System.out.println("In sub(int i, int j)");
		return i - j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorPlus cp = new CalculatorPlus();
		int result = cp.sub(6, 1);
		System.out.println(result);
	}

}
