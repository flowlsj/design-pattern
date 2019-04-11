package com.lsj.basic;

import java.util.*;

public class Generic {
   public static void main(String[] args) {
      
      printT("Hello", 1);
      printT(1, 1.1);
      printT(1.1, 2.2);
      printT("a", 2.2);
      printT('A', "A");
      
      MyGeneric<String> my_generic = new MyGeneric<String>();
      my_generic.set("Louis");
      my_generic.print();
      
      List<String> string_list = new ArrayList<String>();
      string_list.add("Hello");
      string_list.add("Louis");
      printData(string_list);
      
      List<Double> double_list = new ArrayList<Double>();
      double_list.add(1.2);
      double_list.add(2.3);
      printData(double_list);
   }
   
   /*
    * Genric method test
    */
   public static <T, E> void printT(T t, E e){
      System.out.println(t + " and " + e);
   }
   
   /*
    * wildcard ? test
    */
   public static void printData(List<?> data){
      for(int index = 0; index < data.size(); index++){
         System.out.println(data.get(index));
      }
   }
}

/*
 * Generic class test
 */
class MyGeneric<T> {
   T t;
   
   public void set(T t){
      this.t = t;
   }
   
   public T get(){
      return this.t;
   }
   
   public void print(){
      System.out.println(t);
   }
}
