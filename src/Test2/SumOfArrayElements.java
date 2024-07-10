package Test2;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int ar[]= {2,3,5,1};
		int sum=0;
		
		for(int i=0; i<=ar.length-1; i++) {
			
			sum=sum+ar[i];
		}
		System.out.println(sum);
		
	}
	
}
