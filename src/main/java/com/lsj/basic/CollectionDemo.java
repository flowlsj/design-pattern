package com.lsj.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<>();
		number.add(12);
		number.add(34);
		number.add(43);
		number.add(1);
		number.add(22);
		
		Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1%10 > o2%10 ? 1 : -1;
			}
		};
		
		Collections.sort(number, c);
		for(Integer a : number)
        {
            System.out.println(a);
        }
		
		System.out.println("---------------------");
		
		
		Collections.sort(number, (i, j) -> i < j ? 1 : -1);
		for(Integer a : number)
		{
			System.out.println(a);
		}
	}

}
