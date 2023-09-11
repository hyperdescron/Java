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

        // Descending order 
        int[] array = {4,-1,5,3,1,2,4};
        int temp;

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j] < array[i]){
                    temp = array[j]; 
                    array[j] = array[i]; 
                    array[i] = temp; 
                }

            }
        }
        System.out.println("Descending order :"+Arrays.toString(array));


        // Ascending order
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j] > array[i]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                
            }
            
        }

        System.out.println("Ascending order :"+Arrays.toString(array));
        
        double[][] multi = new double[3][2];
        multi[0][0]=0;
        multi[0][1]=0.1;
        multi[1][0]=1;
        multi[1][1]=1.1;
        multi[2][0]=2;
        multi[2][1]=2.1;

        System.out.println(Arrays.deepToString(multi));

        // Minimum number in an array
        int[] array2 = {9,6,1,4,7,5,23,456,4,6,8,4,2};
        int temp2 = Integer.MAX_VALUE;
        for(int i : array2){
            if(i < temp2){
                temp2 = i;
            }
        }
        System.out.println("Minimum number : "+temp2);

        // Maximum number in an array
        int temp3 = Integer.MIN_VALUE;
        for(int i : array2){
            if(i > temp3){
                temp3 = i;
            }
        }
        System.out.println("Maximum number : "+temp3);

        // Finding a number in an array
        // Order of elements doesn't matter
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;
        for (int i=0;i<numbers.length;i++) {
            if(key == numbers[i]){
                System.out.println("Found "+key+" at index "+ i);
            }
        }

        // Finding a number in an array another way
        // For this example array must be sorted first
        int key2 = 6;
        System.out.println("Found "+key2+" at index "+Arrays.binarySearch(numbers,key2));
        
        
    
    }}
        
       

        
        
        
