package Test;

public class Even_Odd_countFromArray {

	public static void main(String[] args) {
		
		int[] ar= {2,4,3,5,6,7,9};
		int even=0;
		int odd=0;
		
		for(int i=0; i<=ar.length-1; i++) {
			
			if(ar[i]%2==0) 
			{
				even++;
			}
			else 
			{
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
	}
	
}
