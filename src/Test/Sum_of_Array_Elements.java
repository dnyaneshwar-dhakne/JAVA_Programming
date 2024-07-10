package Test;

public class Sum_of_Array_Elements {
	
	public static void main(String[] args) {
		
		int[] ar= {2,4,5,8,1};
		
		int sum=0;
		
		for(int i=0; i<=ar.length-1; i++) {
			
			sum= sum+ar[i];
		}
		System.out.println(sum);
		
	}

}
