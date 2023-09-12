package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Polymorphism is using Superclasses methods
        // from subclasses, but every subclass has their own implementation of method
         

        Animal animal = new Animal();
        animal.makeNoise();

        Dog dog = new Dog(25, "Storm", "Shiba Inu");
        dog.makeNoise();
    }
}
