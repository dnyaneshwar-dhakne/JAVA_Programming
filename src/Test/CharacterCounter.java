package Test;

public class CharacterCounter {
    public static void main(String[] args) {
        String str = "#CApgemIni $S er vices07";
        
        int specialCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int spacesCount = 0;
        
        for (int i = 0; i <= str.length()-1; i++) {
        	
            char ch = str.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } 
            else if (Character.isLowerCase(ch)) {
                lowerCount++;
            } 
            else if (Character.isDigit(ch)) {
               digitCount++;
            } 
            else if (Character.isWhitespace(ch)) {
            	spacesCount++;
            }
            else {
                specialCount++;
            }
        }
        
        System.out.println("Number of special characters: " + specialCount);
        System.out.println("Number of uppercase characters: " + upperCount);
        System.out.println("Number of lowercase characters: " + lowerCount);
        System.out.println("Number of digits:" + digitCount);
        System.out.println("Number of Spaces:" + spacesCount);
    }
}