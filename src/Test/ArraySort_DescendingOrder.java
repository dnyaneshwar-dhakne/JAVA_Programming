package Test;

public class ArraySort_DescendingOrder {
	
    public static void main(String[] args) {
        int[] ar = {5, 2, 9, 1, 6};

        // Bubble sort in descending order
        for (int i = 0; i < ar.length - 1; i++) {
        	
            for (int j = 0; j < ar.length - i - 1; j++) {
            	
                if (ar[j] < ar[j + 1]) {
                  
                	// Swap elements
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }

        System.out.println(ar[1]);
        // Print the sorted array
        for (int num : ar) {
            System.out.print(num + " ");
            
          
        }
    }
}
