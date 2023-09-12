package OOP.ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        // We are inside the Main class main method
        // Classes are blueprint for creating objects

        // Creating new Student Object

        Student student = new Student(); // Student with no parameters
        Student student2 = new Student(1, "Marcel", 20); // Student with parameters

        student.name = "Kate"; // Here we are assigning student object a name
        // This is considered bad practice
        // General convention is to use getter and setter methods
        // Which is called Encapsulation

        System.out.println(student.name);

        // We can create objects as many as we need from student class
        // That is why classes are called blueprints
        // We define methods and attributes in the class
        // Then we can use those attributes an methods on the objects we created
        // We use constructors to specify the objects attributes
        // We created student with no args constructor and constructor with parameters

        student.study();
        
        
        System.out.println(student2.study(student2.age));
        Student student3 = new Student(-5);
        System.out.println(student3.age);
    }
}
