package Test3;

public class Find2ndMaxNumberFromArray2 {
	
	public static void main(String[] args) {
		
		int ar[]= {5,3,7,9,1};
		
		// Bubble sort in descending order
        for (int i = 0; i < ar.length - 1; i++) {
        	
            for (int j = 0; j < ar.length - i - 1; j++) {
            	
                if (ar[j] > ar[j + 1]) {
                  
                	// Swap elements
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        
        int se = ar[ar.length-2];
        System.out.println("second max number is "+ se);

        // Print the sorted array
        for (int num : ar) {
            System.out.print(num + " ");
           
        }
		
	}

}
