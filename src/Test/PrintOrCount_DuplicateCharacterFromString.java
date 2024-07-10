package Test;

import java.util.HashMap;
import java.util.Set;

public class PrintOrCount_DuplicateCharacterFromString {
	
public static void main(String[] args) {
        
        String s = "dnyaneshwarrdd";
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(int i=0; i<=s.length()-1; i++){
            
          char ch= s.charAt(i);
          
          if(map.containsKey(ch)){
              
              map.put(ch, map.get(ch)+1);
          }
          else{
              map.put(ch,1);
          }
            
        }
        
        Set<Character> keys = map.keySet();
        
        for(Character key:keys){
            
           if(map.get(key)>1){
                
                System.out.println(key+":"+ map.get(key));
            }
        }
        

    }

}
