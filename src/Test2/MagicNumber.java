package Test2;

public class MagicNumber {
	
	public static boolean name(int no) {
		
		if(no%9==1) 
			return true;
		else
			return false;
			
	}
	
	public static void main(String[] args) {
		
		int no=1720;
		
		if(name(no))
		System.out.println("Magic Number");
		else 
			System.out.println("Not a Magic Number");
			
	}
	

}
