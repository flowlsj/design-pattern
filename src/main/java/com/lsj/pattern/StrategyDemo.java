/*
 * Strategy pattern. 
 * Make algorithm(behavior) independent.
 * Client - Algorithm is "has a" relationship
 * 
 */

package com.lsj.pattern;

abstract class Duck{
   
   private Flyable flyDelegate;
   private Quackable quackDelegate;
   
   
   public void fly() {
      flyDelegate.fly();
   }
   
   public void quack() {
      quackDelegate.quack();
   }
   
   public void swim(){
      System.out.println("Duck swim");
   }
   
   
   public abstract void display();
   
   
   public Flyable getFlyDelegate() {
      return flyDelegate;
   }
   public void setFlyDelegate(Flyable flyDelegate) {
      this.flyDelegate = flyDelegate;
   }
   public Quackable getQuackDelegate() {
      return quackDelegate;
   }
   public void setQuackDelegate(Quackable quackDelegate) {
      this.quackDelegate = quackDelegate;
   }
   
}

interface Flyable{
   void fly();
}

interface Quackable{
   void quack();
}


class FlyWithWings implements Flyable{

   @Override
   public void fly() {
      System.out.println("Fly with wings");
   }
}

class FlyWithKongFu implements Flyable{

   @Override
   public void fly() {
      System.out.println("Fly with kongfu");
   }
}

class QuackLikeSing implements Quackable{

   @Override
   public void quack() {
      System.out.println("Quack like sing");
   }
}

class QuackWithNoise implements Quackable{

   @Override
   public void quack() {
      System.out.println("Quack noise");
   }
}

class MallardDuck extends Duck{

   @Override
   public void display() {
      System.out.println("I am Mallar duck");
   }
}

class RedheadDuck extends Duck{

   @Override
   public void display() {
      System.out.println("I am read head duck");
   }
}

class RubberDuck extends Duck{

   @Override
   public void display() {
      System.out.println("I am rubber duck");
   }
}

public class StrategyDemo {

   public static void main(String[] args) {
      Duck redHeadDuck = new RedheadDuck();
      redHeadDuck.setFlyDelegate( () -> {
         System.out.println("Anonymous flyable");
      });
      redHeadDuck.fly();
      
      redHeadDuck.setFlyDelegate(new Flyable(){

         @Override
         public void fly() {
            // TODO Auto-generated method stub
            System.out.println("Annoyous fly");
         }
         
      });
      redHeadDuck.fly();
   }

}
