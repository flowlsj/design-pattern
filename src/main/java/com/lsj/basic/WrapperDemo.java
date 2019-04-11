package com.lsj.basic;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 5;
		Integer ii = new Integer(i); //boxing - wrapping
		int j = ii.intValue(); //unBoxing - unWarpping
		
		Integer k = i; //autoBoxing - autoWrapping
		int l = k; //autoUnboxing - autoUnwrapping
	}

}
