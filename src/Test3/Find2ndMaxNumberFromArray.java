package Test3;

import java.util.Arrays;

public class Find2ndMaxNumberFromArray {
	
	public static void main(String[] args) {
		
		int ar[]= {5,3,7,9,2,44,23};
		
		//to print array in ascending order
		Arrays.sort(ar);
		//System.out.println(Arrays.toString(ar));
		
		//Finding 2nd largest number
		int secodLargestNum=ar[ar.length-2];
		System.out.println("Second largest number is "+secodLargestNum);
		
		//Finding max number
		int maxNumber=ar[ar.length-1];
		System.out.println("Max number is "+ maxNumber);
		
		//Finding min number
		int minNumber=ar[0];
		System.out.println("Min number is "+ minNumber);
	}

}
