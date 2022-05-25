package StringManipulation;

import java.util.HashMap;

public class CountTheCharacterNumbers {
	
	public static void countCharacter(String name) {
		HashMap<Character, Integer> map = new HashMap<>();	
		char[] ch = name.toCharArray();
		
		for(char element : ch) {
			if(map.get(element)==null) {
				map.put(element, 1);
			}
			else {
				map.put(element, map.get(element)+1);
			}
		}
		System.out.println(map);
	}
	
	public static void main(String args[]) {

		countCharacter("UjjwalSagar");
	}
	
}
