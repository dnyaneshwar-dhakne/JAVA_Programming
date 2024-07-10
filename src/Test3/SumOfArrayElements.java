package Test3;

import java.util.LinkedHashSet;

public class SumOfArrayElements {
	
	public static void main(String[] args) {
		
		int ar[]= {1,2,2,3};
		
		int sum=0;
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0; i<=ar.length-1; i++) {
			
			set.add(ar[i]);
			
		}
		
		for(int a:set) {
			
			sum=sum+a;		
		}
		
		System.out.println(sum);		
	}

}
