package OOP.ClassesAndObjects;

public class Student { // Here we are creating student class

    int id; // Bad practice since we are not using access modifiers
    String name; // Bad practice since we are not using access modifiers
    int age; // Bad practice since we are not using access modifiers

    public Student(){ // Everytime we create object empty constructor is called implicitly
        // If we don't define one
    }

    // Constructors are used to initialize objects 
    // We can initialize empty constructor 
    // Or constructor with arguments
    // Consturctors cannot return anything

    public Student(int id,String name,int age){ // Constructor with args
        this.id = id; // this keyword has several meanings
        this.name = name; // Here this keyword refers to the instance variable 
        this.age = age; // We are assigning the instance variable to parameter
        // This keyword helps avoid confusion
        // You can assign instance variable to parameter studentId and code id = studentId 
    }

    // Creating another constuctor with some logic to prevent user from entering invalid input
    public Student(int age){
        if(age < 0 || age > 120){
            age = 15; // if age is entered less than 0 or higher than 120
            // Age will be assigned to 15 by default
        }
        this.age = age;
    }



    // We defined a method for Student class
    // We can call this method from any Student object
    public void study(){
        System.out.println("Student is studying");
    }

    // We can even use it with parameters to give method more functionality
    public String study(int age){
        return name+" is studying He/She is "+age+" years old";
    }



}
