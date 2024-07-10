package Test3;

public class Tiger extends Animal {

	void m1() {
		
		System.out.println("subclass tiger m1");
	}
	
	public static void main(String[] args) {
		
	Animal t = new Tiger();
	t.m1();
}
}