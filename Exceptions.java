public class Exceptions {
    public static void main(String[] args) {

        // Exceptions are used to handle unwanted or unexpected event
        // Division by 0 is a perfect example to demonstrate
        // We put the code to be tested inside try block
        // Catch block catches exception if any occurred and handles the situation
        // Finally is optional if used it gets executed either way 

        try {
            System.out.println(5/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Program try-catch finished");
        }

        // To give errors more meaning we can specify the exception like so
        try {
            System.out.println(5/0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero " + e);
        }
    }
}
