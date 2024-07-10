package Test;

import java.util.HashMap;

public class WordCount_FromString {
	
    public static void main(String[] args) {
    	
        String s = "java is part is testing java is";
        
        // Split the string into words
        String[] words = s.split(" ");
        
        // Create a HashMap to store word counts
        HashMap<String, Integer> map = new HashMap<>();
        
        // Iterate over the words and count occurrences
        for (String word : words) {
        	
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } 
            else {
                map.put(word, 1);
            }
        }
        
        // Print the word counts
        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }
    }
}