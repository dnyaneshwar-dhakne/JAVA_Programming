package Test;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {
	
	public static void main(String[] args) {
		
        int ar[] = {4, 5, 1, 4, 3, 5, 5};

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        
        //Adding array elements to set
        for(int i=0; i<=ar.length-1; i++) {
        	
        	set.add(ar[i]);
        	
        }
        
           //getting each element from set and printing
           for(int a:set) {
           System.out.print(a + " ");
        }
		
	}

}
