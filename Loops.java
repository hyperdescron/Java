import java.util.Random;
import java.util.Scanner; // importing package to use corresponding built in class

public class Loops {
    public static void main(String[] args) {
        // For loop
        for(int i=0;i<5;i++){
            System.out.println("Hello World!");
        }

        // While loop
        int i=0;
        while(i<5){
            System.out.println("Hello There!");
            i++;
        }

        // Do-while loop
        i=0;
        do{
            System.out.println("Hello!");
            i++;
        }while(i<5);

        // Enhanced for loop
        int[] arr = {1,2,3,4,5};
        for(int j:arr){
            System.out.println(j);
        }

        for(int k=0;k<10;k++){
            if(k%4 == 0){
                continue; // Skips iteration if condition is true
            }else
                System.out.println(k);
        }
        

        Scanner sc = new Scanner(System.in); // Scanner class is used to get input from user from terminal
        String username;
        String password;

        do{
            System.out.println("Enter username");
            username = sc.nextLine();
            System.out.println("Enter password");
            password = sc.nextLine();
        }while(!username.equals("java") || !password.equals("java"));
        // equals method is used to compare two strings 
        // == operator is used to compare numerical values
        System.out.println("Exited program");
        
        Random random = new Random(); // Random class generates a random value
        // We gave a value of 10 as parameter so it will generate a random value between 0(inclusive) and 10(exclusive)
        int number = random.nextInt(10)+1;// We add 1 so that class will start generating value from 1 and not 0
        int guess;
        int lives = 3;
        do{
            System.out.println("Enter a number between 1 and 10");
            guess = sc.nextInt();
            if(guess == number){
                System.out.println("Congratulations you guessed correctly");
            }else{
                System.out.println("Try again");
                lives--;
                System.out.println("Remaining lives : "+lives);
                
            }
        }while(guess != number && lives != 0);
        System.out.println("Exited program");
        sc.close(); // Avoid memory leak


    }
}
