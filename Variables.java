public class Variables {

    int val; // instance variable also called class member

    static int val2 = 5; // static variable 
    public static void main(String[] args) {
        // Data type + variable name = value;
        // When programming in java it is good practice to follow general programming conventions
        // For example naming conventions

        // Reserved keywords cannot be used to name variables
        // Variables are also called identifiers

        int number; // local variable
        // this line is called variable declaration because we haven't assigned it a value

        int numberTwo = 5; // local variable
        // this line is called variable initialization, we assigned numberTwo variable to value 5

        // There are 3 types of variables
        // These are local,static and instance variables

        // Any variable declared inside a method or inside block of code is called local variable
        // Any variable declared with static keyword is called static variable
        // Any variable declared inside a class and outside a method or code block is called instance variable
        // Methods can be static aswell

        // Local variable has to be initialized before use
        // Instance variables doesn't need initialization before use, they have default values

    }
}
