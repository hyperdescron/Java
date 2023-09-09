import java.util.Random;


public class Methods {
    public static void main(String[] args) {
        // Methods are used to avoid code repetition
        // For example String class has many useful built-in methods

        String name = "Micheal Jordan";
        System.out.println("name variable contains " + name.length() + " characters"); // length of String including white-spaces
        System.out.println(name.charAt(2)); // Character at specified index it begins counting from 0 
        System.out.println("name in all lowercase : " + name.toLowerCase());
        System.out.println("name in all uppercase : " + name.toUpperCase());
        System.out.println(name.concat(" MVP")); // Concatenates a string to another string
        System.out.println(name.contains("Jor")); // This method returns true if condition is met
        // Java is case sensitive
        
        sayHi();
        sayHi();
        sayHi();

        System.out.println("Randomly generated fractional number : " + generateValue());
        System.out.println("Randomly generated fractional number : " + generateValue());
        System.out.println("Randomly generated fractional number : " + generateValue());
        System.out.println("Randomly generated fractional number : " + generateValue());

        System.out.println(sayHello("Abigail"));
        System.out.println(sayHello("Vika"));
        System.out.println(sayHello("Dimitry"));

        System.out.println(add(3, 5));
        System.out.println(add(56, 82));
        System.out.println(add(1.2, 2.3));

        System.out.println(multiply(3, 5));

        System.out.println("Hello " + firstname("Will") + " You are " + calculate(1970) + " years old");
              
    }

    // We can write our own methods outside of main method

    public static void sayHi(){ // Return type is void it doesn't return anything
        System.out.println("Hello");
    }

    public static double generateValue(){ // Return type is double we have to return a double value
        Random random = new Random();
        double randomValue = random.nextDouble();
        return randomValue;
    }

    // Methods with parameters
    public static String sayHello(String name){ // This method takes a String parameter 
        return "Hello " + name; // And returns concatenated String
    }

    public static int add(int x, int y) { 
        return x + y;
    }
    // Method overloading
    // Method overloading is using the same method name with different parameters
    // If we don't use different parameters Java will throw error
    // IDE can suggest which method you can use according to parameters
    public static double add(double x, double y){
        return x + y;
    }
    

    public static double multiply(double x, double y){ 
        return x * y + add(12, 25); // Calling another method inside a method
    }

    public static int calculate(int bornYear){
        int currentYear = 2023;
        return currentYear - bornYear;
    }
    public static String firstname(String name){
        return name;
    }

    // There is also method overriding which we will see later

    





}
