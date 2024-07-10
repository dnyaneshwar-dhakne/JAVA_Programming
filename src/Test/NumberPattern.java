package Test;

public class NumberPattern {
    public static void main(String[] args) {
   

        // Print the first half of the pattern
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Print the second half of the pattern
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}