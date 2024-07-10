package Test;

import java.util.Scanner;

public class VowelConsonantCounter {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next().toLowerCase(); // Convert the input to lowercase for case insensitivity
        
        int vowels = 0;
        int consonants = 0;
        
        // Iterate through each character of the input string
        for (int i = 0; i <= input.length()-1; i++) {
        	
            char ch = input.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
            	
                // Check if the letter is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        
        scanner.close();
    }
}