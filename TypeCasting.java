public class TypeCasting {
    public static void main(String[] args) {
        // Type casting is an important aspect of java
        // Type casting is done manually if we narrow the value;
        // Type casting is done automatically if we widen the value

        // Narrowing
        int number = 10;
        byte numberTwo = (byte)number; // Converting data type of number to byte
        System.out.println(numberTwo);

        // Widening
        int numberThree = 516;
        long numberFour = numberThree; // Converting data type of numberThree to long 
        System.out.println(numberFour);
    }
}
