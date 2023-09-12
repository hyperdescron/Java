package OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
        // Interface is a blueprint for common behaviour(methods) of classes
        // Interface methods has to be implemented by any class that implements that particular interface
        // Interface methods are abstract by default and does not have a constructor
        Car car = new Car();
        car.speedUp();
        car.slowDown();
        car.idle();
    }
}
