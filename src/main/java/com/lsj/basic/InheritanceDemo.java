package com.lsj.basic;


class Calculator 
{
    public int add(int i, int j) 
    {
        System.out.println("In add(int i, int j)");
        return i + j;
    }
    
    public int sub(int i, int j) 
    {
        System.out.println("In Calculator.sub(int i, int j)");
        return i - j;
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

class CalculatorPlus extends Calculator
{
	@Override
    public int sub(int i, int j)
	{
		System.out.println("In CalculatorPlus.sub(int i, int j)");
		return i - j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
	    Calculator cp = new CalculatorPlus();
		int result = cp.sub(6, 1);
		System.out.println(result);
	}

}
