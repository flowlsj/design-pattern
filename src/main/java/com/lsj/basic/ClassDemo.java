package com.lsj.basic;

import java.net.URL;
import java.net.URLClassLoader;

interface Bark{}
interface Eat{}

class Animal{}

class Dog extends Animal implements Bark, Eat{

}

public class ClassDemo {
    static void printClassInfo(Class c){
        System.out.println("Simple name: " + c.getSimpleName());
        System.out.println("Canonical name: " + c.getCanonicalName());
        System.out.println("Is interface? " + c.isInterface());
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class c = null;
        try {
            c = Class.forName("com.lsj.basic.Dog");
            printClassInfo(c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if( c != null) {
            for(Class ic : c.getInterfaces()){
                printClassInfo(ic);
            }
            Class parentClass = c.getSuperclass();
            if (parentClass != null){
                printClassInfo(parentClass);
                Object obj = parentClass.newInstance();
                printClassInfo(obj.getClass());
            }
        }

        ClassLoader sysClassLoader = ClassLoader.getSystemClassLoader();
        URL[] urls = ((URLClassLoader)sysClassLoader).getURLs();
        for(int i=0; i< urls.length; i++)
        {
            System.out.println(urls[i].getFile());
        }
    }
}
