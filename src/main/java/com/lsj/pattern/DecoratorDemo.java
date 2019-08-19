/*
 * Decorator pattern. 
 * Enhance component with more functions by decorator instead of inheritance.
 * 
 */

package com.lsj.pattern;

abstract class Warrior {
    String description;
    
    abstract void fight();
    
    public String getDescription(){
        return this.description;
    }
}

class Swordsman extends Warrior{
    
    public Swordsman() {
        this.description = "I am swordsman";
    }

    @Override
    void fight() {
        
        System.out.println("Swordsman fight");
    }
    
}

class Blademaster extends Warrior {
    
    public Blademaster () {
        this.description = "I am blademaster";
    }

    @Override
    void fight() {
        
        System.out.println("Blademaster fight");
    }
    
}

abstract class WarriorWeapon extends Warrior {
    
    Warrior warrior;
    
    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public abstract String getDescription();
}

class Excalibur extends WarriorWeapon {

    @Override
    void fight() {
        
        this.warrior.fight();
        System.out.println("Fight with Excalibur");
    }

    @Override
    public String getDescription() {
        
        return this.warrior.getDescription() + " + excalibur";
    }
    
}

class Sabre extends WarriorWeapon {

    @Override
    void fight() {
        
        this.warrior.fight();
        System.out.println("Fight with Sabre");
    }

    @Override
    public String getDescription() {
        
        return this.warrior.getDescription() + " + sabre";
    }
    
}

public class DecoratorDemo {
    public static void main(String[] args) {
        Swordsman sm = new Swordsman();
        System.out.println(sm.getDescription());
        sm.fight();
        Excalibur excalibur = new Excalibur();
        excalibur.setWarrior(sm);
        System.out.println(excalibur.getDescription());
        excalibur.fight();
    }
}
