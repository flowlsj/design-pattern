/*
 * Observer pattern. 
 * Construct 1-N relationship.
 * Observers get notified when subject gets changed.
 * 
 */

package com.lsj.pattern;

import java.util.List;
import java.util.ArrayList;

interface Subject {
    void registerObserver(Observer obj);
    void removeObserver(Observer obj);
    void notifyObserver();
    
    Object getMessage();
}

interface Observer {
    void update(Subject sub);
}

class Publisher implements Subject{
    private List<Observer> observerList = new ArrayList<Observer>();
    private int id;
    private static int GLOBAL_COUNT = 0;
    
    public Publisher(){
        System.out.println("New publisher " + id);
        id = GLOBAL_COUNT;
        GLOBAL_COUNT++;
    }

    @Override
    public void registerObserver(Observer obj) {
        // TODO Auto-generated method stub
        int index = this.observerList.indexOf(obj);
        if (index == -1){
            this.observerList.add(obj);
        }
    }

    @Override
    public void removeObserver(Observer obj) {
        // TODO Auto-generated method stub
        int index = this.observerList.indexOf(obj);
        if (index != -1){
            this.observerList.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub
        for (Observer obj : this.observerList){
            obj.update(this);
        }
    }

    @Override
    public Object getMessage() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Publisher " + id;
    }
}

class Customer implements Observer{

    @Override
    public void update(Subject sub) {
        // TODO Auto-generated method stub
        Object obj = sub.getMessage();
        System.out.println(obj.toString());
    }
    
}

public class ObserverDemo {

   public static void main(String[] args) {
       // TODO Auto-generated method stub
       Subject sub = new Publisher();
       Observer observer1 = new Customer();
       Observer observer2 = new Customer();
       sub.registerObserver(observer1);
       sub.registerObserver(observer2);
       sub.notifyObserver();
   }

}
