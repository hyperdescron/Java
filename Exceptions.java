import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

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

        try{
            int[] arr = new int[5];
            arr[5] = 2;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
            System.out.println(e.getMessage());
        }

        try{
            int num = Integer.parseInt("null");
        }catch(NumberFormatException e){
            System.out.println("Number format exception");
            System.out.println(e.getMessage());
        } 

        try {
            file();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Try-catch finished");
        }

        System.out.println("Program continues...");
        
        

        
    }

    public static void file() throws FileNotFoundException{
        FileReader file = new FileReader("/abc.txt");
        BufferedReader br = new BufferedReader(file);
        throw new FileNotFoundException();
    }

  
    
    
}
