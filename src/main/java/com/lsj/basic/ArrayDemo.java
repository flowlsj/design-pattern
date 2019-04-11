package com.lsj.basic;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int nums[] = new int[4];
		
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		for(int a : nums)
		{
			System.out.print(a + " ");
		}
		System.out.println();
		
		int jaggedArray[][] = {
		        {1,2,3,4},
				{5,6,7},
				{8,9}
		};
		
		for(int i = 0; i < jaggedArray.length; i++) {
			for(int j = 0; j < jaggedArray[i].length; j++)
			{
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
