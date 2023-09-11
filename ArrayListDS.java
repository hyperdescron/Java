import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDS {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.println(myList);

        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {5,75,3,12,423};
        int[] arr3 = {98,234,56,12};
        arrayList.add(arr);
        arrayList.add(arr2);
        arrayList.add(arr3);
        
        for(int[] i : arrayList){
            System.out.println(Arrays.toString(i));
 
        }

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Melissa");
        arrayList2.add("Aragorn");
        arrayList2.add("Gandalf");
        arrayList2.add("");
        arrayList2.set(3, "Saruman");
        System.out.println(arrayList2.get(2));
        
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3 = (ArrayList<String>) arrayList2.clone();
        System.out.println("Clone array list : "+arrayList3);

        arrayList2.clear();
        System.out.println(arrayList2);

        System.out.println(arrayList2.equals(arrayList3));
        arrayList2 = arrayList3; // Same reference
        System.out.println(arrayList2.equals(arrayList3)); // Since 2 arraylist pointing to the same reference
        System.out.println(arrayList2);
        arrayList2.set(0, "Sauron");
        System.out.println(arrayList3); 

        System.out.println(arrayList2.contains("Sauron"));

        arrayList2.remove("Sauron");
        System.out.println(arrayList2);
        System.out.println(arrayList2.indexOf("Gandalf"));

        System.out.println(arrayList2.getClass());

        // As we can see arraylists are much more flexible compared to arrays
        // Arraylists provides various methods to manipulate data
        // Arraylists size isn't fixed-size we can change it anytime unlike arrays
        // Upon adding new elements arraylists size growes automatically
        // Arraylist type cannot be primitive types example int,double etc..
        // Integer is wrapper class for int data type
        // int[] and Strings are reference data type

    }

}
