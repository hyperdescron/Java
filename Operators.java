public class Operators {
    public static void main(String[] args) {
        // Operators are used to perform mathematical operations

        System.out.println(1+3);
        System.out.println(1/3);
        System.out.println(1*3);
        System.out.println(1-3);

        // + operator has another use when used with Strings called concatenation
        System.out.println("My name is " + "Jack");

        System.out.println(10+20 + " = " + 30); // Here we used ints before String
        // Therefore program treated + sign as an addition operator


        System.out.println(""+10+20 +" = " + "?");// Here we used String before ints
        // Therefore program concatenated all values

        int number = 5;
        number++; // This operation is called post increment
        System.out.println(number);
        ++number; // This operation is called pre increment
        System.out.println(number);

        number--; // Post decrement
        --number; // Pre decrement

        number = number % 2; // Here we have modulus operator
        System.out.println(number);

        // Shorthand operators
        number += 1; // Same as number = number + 1 
        number -= 2;
        number *= 3;
        number /= 4;
        number %= 10;

        System.out.println(1/4); // This calculation isn't precise because we are dealing with int data type

        System.out.println(1.0/4.0); // If you need presicion use double or float data type
        
    }
}
