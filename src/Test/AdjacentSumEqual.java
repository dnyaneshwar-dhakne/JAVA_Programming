package Test;

public class AdjacentSumEqual {

   public static boolean adjacentSum(int ar[], int a) {
	   
	   for(int i=0; i<=ar.length-1; i++) {
		   
		   if(ar[i]+ar[i+1]==a) {
			   
			   return true;
		   }
		   
	   }
	return false;
	   
   }
	
   
   public static void main(String[] args) {
	
	   int ar[]= {1,2,3};
	   
	   int a=5;
	   
	  if(adjacentSum(ar, a)) {
		  System.out.println("True");
	  }
	  else {
		  System.out.println("False");
	  }
}
   
}
