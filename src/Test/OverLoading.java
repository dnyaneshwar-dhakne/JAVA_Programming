package Test;

public class OverLoading {
    public final void myStaticMethod(int x, int y) {
       System.out.println(x+y);
    }

    public final void myStaticMethod(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        OverLoading mc = new OverLoading();
    	mc.myStaticMethod(5,4);
        mc.myStaticMethod("Hello test");
    }
}
