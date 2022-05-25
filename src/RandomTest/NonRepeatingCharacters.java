package RandomTest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NonRepeatingCharacters {
    
    
    public static Character firstNonRepeatedCharacter(String str)
    {
        Set<Character> repeatingChars = new HashSet<>();
        List<Character> nonRepeatingChars = new ArrayList<>();
        for(int i=0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if(repeatingChars.contains(letter))
                continue;
            if(nonRepeatingChars.contains(letter)) {
                nonRepeatingChars.remove((Character) letter);
                repeatingChars.add(letter);
            }
            else {
                nonRepeatingChars.add(letter);
            }
        } 
        return nonRepeatingChars.get(0);
    }
    
    public static Character firstNonRepeatedCharacter1(String str)
    {
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        
        char[] chArr = str.toCharArray();
        char ch1 = 0 ;
        
        for(char c : chArr) {
        	if(map1.containsKey(c)) {
        		map1.put(c, map1.get(c)+1);
        	}
        	else {
        		map1.put(c, 1);
        	}
        }
        
        Set<Entry<Character, Integer>>s1 = map1.entrySet();
        for(Entry<Character, Integer> s : s1) {
        	if(s.getValue()==1) {
        		ch1 = s.getKey();
        		System.out.println(ch1);
        		break;
        	}
        }
        
        return ch1;
    }

    public static void main(String[] args)
    {
        
        String s = "uuujjjwal";
        char ch = firstNonRepeatedCharacter(s);
        System.out.println("The first non repeated character is :  " + ch);
        
        char ch1 = firstNonRepeatedCharacter1(s);
        System.out.println("The first non repeated character is :  " + ch1);
        
    }
}    