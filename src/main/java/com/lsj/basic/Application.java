package com.lsj.basic;

class Casio
{
	public void add(int i, int j)
	{
		System.out.println(i + j);
	}
}


public class Application {
	
	/*
	 * 
	 * Java course from Youtube
	 * Author: Louis
	 * Email: shijia.liu@bitmain.com
	 * 
	 */
	
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for(char i = 'A'; i <= 'Z'; i++) {
			for(char j = 'A'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
