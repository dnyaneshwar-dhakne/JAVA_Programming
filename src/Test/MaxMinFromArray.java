package Test;

public class MaxMinFromArray {
    public static void main(String[] args) {
        int[] ar = {1, 3, 5, 6, 8};
        
        // Initialize min and max with the first element of the array
        int min = ar[0];
        int max = ar[0];
        
        // Iterate through the array to find min and max
        for (int i = 1; i <= ar.length-1; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
            else if (ar[i] > max) {
                max = ar[i];
            }
        }
        
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}