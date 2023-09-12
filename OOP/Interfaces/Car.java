package OOP.Interfaces;

public class Car implements Vehicle{// Implementing Vehicle interface using implements keyword

    @Override
    public void speedUp() {
        System.out.println("Car is speeding up");
    }

    @Override
    public void slowDown() {
        System.out.println("Car is slowing down");
    }

    @Override
    public void idle() {
        System.out.println("Standby");
    } 
    
}
