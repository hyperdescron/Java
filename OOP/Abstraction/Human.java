package OOP.Abstraction;

public abstract class Human { // Abstract class
    protected String name; // Making name protected so that we can see it from Student class

    // Abstract method 
    // We do not provide the code of method
    // So that each class has their own implementation
    public abstract void study();
    // Subclasses of Human must implement abstract methods

    
    // We can have non-abstract regular methods
    public void sleep(){
        System.out.println("Human is sleeping");
    }


    public Human(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    

}
