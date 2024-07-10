package Test;

public class StringReverse {

	public static void main(String[] args) {

	String rev="";
	String s="naman";
	
	for(int i=s.length()-1; i>=0; i--) {
		
		rev=rev+s.charAt(i);
		
	}
	
	System.out.println(rev);
	
	if(s.equals(rev)) {
		System.out.println("Palindrom");
	}
	else {
		System.out.println("not palindrom");
	}
}
	
}