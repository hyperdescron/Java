public class Conditionals {
    public static void main(String[] args) {
        // In this section we will cover if-else and swtich statements

        // If-else
        int age = 18;
        if(age < 18 && age > 12){
            System.out.println("Teenager");
        }else if (age >= 18 && age < 30){
            System.out.println("Youngblood");
        }else if(age >= 30 && age < 65){
            System.out.println("Elder");
        }else{
            System.out.println("child or undead");
        }

        // Switch
        String name = "Marvin";
        switch(name){
            case "Alice":System.out.println("I am Alice");break;
            case "David":System.out.println("I am David");break;
            case "Marvin":System.out.println("I am Marvin");break;
            default:System.out.println("Enter valid name");
        }

        // Enhanced switch 

        char val ='b';
        switch(val){
            case 'a' -> System.out.println("First letter");
            case 'b' -> System.out.println("Second letter");
            case 'c' -> System.out.println("Third letter");
            default -> System.out.println("Enter valid character");
        }

        // Ternary operator
        // Shorthand if else statement

        System.out.println(5>3 ? true : false);

        

    }
}
