package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Encapsulation is one of 4 OOP principles
        // It is the process of hiding variables from other classes
        
        Student student = new Student(1,"Jack",24);
        // If you uncomment this you will get error student.name = "Jack";
        // Here we prevented user from setting attributes
        // Here is the general convention to do this
        student.setName("Will"); // Setting name to another variable
        System.out.println(student.getName()); // Getting name

        // Using overridden toString method
        System.out.println(student.toString());

        // You can override toString method to see all the attributes of an object
        // Or if you want to see an objects particular attribute use getter method
    }
}
