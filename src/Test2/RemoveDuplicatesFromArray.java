package Test2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int ar[] = {4, 5, 1, 4, 3, 5, 5};
        int[] result = removeDuplicates(ar);
        
        System.out.println("Array with duplicates removed:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public static int[] removeDuplicates(int[] ar) {
        // Create a Set to store unique elements
        Set<Integer> set = new LinkedHashSet<>();
        
        // Add elements to the Set, which automatically removes duplicates
        for (int i = 0; i < ar.length; i++) {
            set.add(ar[i]);
        }
        
        // Convert Set back to array
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            result[index++] = num;
        }
        
        return result;
    }
}