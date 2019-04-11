/*
 * Factory pattern. 
 * Create product in concrete subclass. Therefore, no changes are needed when new product coming.
 * 
 */


package com.lsj.pattern;


abstract class Car {
    String brand;
    
    public String getBrand() {
        return this.brand;
    }
    
    abstract void accelerate();
    abstract void dcelerate();
}

class ChevroletCar extends Car {
    
    public ChevroletCar() {
        this.brand = "Chevrolet";
    }

    @Override
    void accelerate() {
        System.out.println("Chevrolet accelerate");
    }

    @Override
    void dcelerate() {
        System.out.println("Chevrolet delerate");
    }
    
}

class VolvoCar extends Car {
    
    public VolvoCar() {
        this.brand = "Volvo";
    }

    @Override
    void accelerate() {
        System.out.println("Volvo accelerate");
    }

    @Override
    void dcelerate() {
        System.out.println("Volvo delerate");
    }
    
}

class CadillacCar extends Car {
    
    public CadillacCar() {
        this.brand = "Cadillac";
    }

    @Override
    void accelerate() {
        System.out.println("Cadillac accelerate");
    }

    @Override
    void dcelerate() {
        System.out.println("Cadillac delerate");
    }
    
}

abstract class CarFactory {
    abstract Car createCar();
}

class ChevroletCarFactory extends CarFactory{

    @Override
    Car createCar() {
        Car car = new ChevroletCar();
        return car;
    }
    
}

class VolvoCarFactory extends CarFactory{

    @Override
    Car createCar() {
        Car car = new VolvoCar();
        return car;
    }
    
}

class CadillacCarFactory extends CarFactory{

    @Override
    Car createCar() {
        Car car = new CadillacCar();
        return car;
    }
    
}

class FourSStore {
    
    protected CarFactory carFactory;
    
    public void sellCar() {
        Car car = carFactory.createCar();
        System.out.println(car.getBrand() + " got saled");
    }

}

class ChevroletFourSStroe extends FourSStore {

    public ChevroletFourSStroe() {
        this.carFactory = new ChevroletCarFactory();
    }
    
}

class VolvoFourSStroe extends FourSStore {

    public VolvoFourSStroe() {
        this.carFactory = new VolvoCarFactory();
    }
    
}

class CadillacFourSStroe extends FourSStore {

    public CadillacFourSStroe() {
        this.carFactory = new CadillacCarFactory();
    }
    
}

public class FactoryDemo {

    public static void main(String[] args) {
        ChevroletFourSStroe cStroe = new ChevroletFourSStroe();
        cStroe.sellCar();
    }

}
