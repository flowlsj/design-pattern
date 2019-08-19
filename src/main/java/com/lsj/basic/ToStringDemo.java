package com.lsj.basic;

class InfiniteRecursion {
    @Override
    public String toString() {
        return super.toString();
    }
}

/**
 * @author shijia.liu
 */
public class ToStringDemo {
    public static void main(String[] args){
        System.out.println(new InfiniteRecursion());
    }
}
