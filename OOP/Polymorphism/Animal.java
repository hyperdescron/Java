package OOP.Polymorphism;

public class Animal {
    private int speed;
    private String name;

    

    public Animal() {
    }

    

    public Animal(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }







    public String getName() {
        return name;
    }







    public void setName(String name) {
        this.name = name;
    }







    public void makeNoise(){
        System.out.println("Animal makes noise");
    }


}
