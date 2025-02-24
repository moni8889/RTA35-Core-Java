package com.monica.learning.core.abstractionExamples;

abstract class Car{
    public abstract void startEngine();
}

class ElectricCar extends Car{
    public ElectricCar(){
        System.out.println("This is Electric Car!");
    }
    @Override
    public void startEngine(){
        System.out.println("Electric Car Starts!");
    }
}
class PetrolCar extends Car{
    public PetrolCar(){
        System.out.println("This is Petrol Car!");
    }
    @Override
    public void startEngine(){
        System.out.println("Petrol Car Starts!");
    }
}
public class AbstractionCarEngineSystem {
    public static void main(String[] args) {
        Car car1 = new ElectricCar();
        car1.startEngine();

        Car car2 = new PetrolCar();
        car2.startEngine();
    }
}
