package com.lsj.basic;

import java.util.List;
import java.util.ArrayList;

public class ForLoop {

   public static void main(String[] args) {
      int[] array = new int[10];
      forLoopSimple(array);
      
      List<Integer> my_list = new ArrayList<Integer>();
      my_list.add(3);
      my_list.add(7);
      Integer[] new_list = new Integer[10];
      forLoop(my_list.toArray(new_list));
   }
   
   public static void forLoop(Integer[] list){
      for(int var: list){
         System.out.println(var);
      }
   }
   
   public static void forLoopSimple(int[] list){
      for(int index = 0; index < list.length; index++){
         System.out.println(list[index]);
      }
   }
}
