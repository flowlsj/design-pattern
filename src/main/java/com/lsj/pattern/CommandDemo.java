/*
 * Command pattern. 
 * Create a command object to delegate request, thus, client doesn't need to know the detail of receiver.
 * 
 */

package com.lsj.pattern;


abstract class Weapon {
    int damage;
}

class Blade extends Weapon {
    
    public Blade(int damage){
        this.damage = damage;
    }
    public void cut() {
        System.out.println("Blade cut, damage: " + this.damage);
    }
}

class Gun extends Weapon {
    
    public Gun(int damage) {
        this.damage = damage;
    }
    public void shot() {
        System.out.println("Gun shot, damage: " + this.damage);
    }
}

interface Command {
    void execute();
}

class FightWithBladeCommand implements Command{
    
    private Blade blade;
    
    public FightWithBladeCommand(Blade blade) {
        this.blade = blade;
    }

    @Override
    public void execute() {
        blade.cut();
    }
    
}

class FightWithGunCommand implements Command{
    
    private Gun gun;
    
    public FightWithGunCommand(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void execute() {
        gun.shot();
    }
    
}

class Military {
    Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void fight() {
        this.command.execute();
    }
}

public class CommandDemo {

    public static void main(String[] args) {
        Blade blade = new Blade(100);
        FightWithBladeCommand fightWithBladeCommand = new FightWithBladeCommand(blade);
        
        Gun gun = new Gun(1000);
        FightWithGunCommand fightWithGunCommand = new FightWithGunCommand(gun);
        
        Military military = new Military();
        military.setCommand(fightWithBladeCommand);
        military.fight();
        
        military.setCommand(fightWithGunCommand);
        military.fight();
    }

}
