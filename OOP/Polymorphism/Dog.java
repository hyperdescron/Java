package OOP.Polymorphism;

public class Dog extends Animal{
    
    private String breed;

    


    public Dog(int speed, String name, String breed) {
        super(speed, name);
        this.breed = breed;
    }




    @Override
    public void makeNoise(){
        System.out.println("Dog makes noise Wuf Wuf");
    }




    public String getBreed() {
        return breed;
    }




    public void setBreed(String breed) {
        this.breed = breed;
    }
}
