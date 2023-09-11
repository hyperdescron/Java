import java.util.Arrays;

public class ArrayDS {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 0;
        number[1] = 1;
        number[2] = 2;
        number[3] = 3;
        number[4] = 4;

        try {
            number[5] = 5;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            
        }finally{
            System.out.println("Try-catch finished");
        }

        int[] nums = {0,1,2,3,4};
        for(int i : nums){
            System.out.println(i);
        }

        System.out.println(Arrays.toString(nums));
        
        // Reverse array
        int[] arr = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            
            arr[i] = nums[nums.length-i-1];
        }
        System.out.println(Arrays.toString(arr));






    }}
