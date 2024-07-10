package Test2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        scanner.close();
    }
}