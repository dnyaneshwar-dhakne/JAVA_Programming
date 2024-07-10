package Test2;

public class Min_Max_NumberFromArray {

	public static void main(String[] args) {
		
		 int[] ar = {10, 3, 5, 6, 8};
		 int min = ar[0];
		 int max = ar[0];
		 for(int i=1; i<=ar.length-1; i++) {
			 
			 if(ar[i]> max) {
				 max=ar[i];
				 
			 }
			 else if(ar[i] < min){
				min = ar[i];
			 }
			 
		 }
		 System.out.println(max);
		 System.out.println(min);
		 
		
	}
	
}
