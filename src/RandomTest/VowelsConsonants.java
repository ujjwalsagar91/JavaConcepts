package RandomTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelsConsonants {

	public static void vowelConsonantCount(String name) {
		List<Character> vowelsList = Arrays.asList('a','e','i','o','u');
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i=0; i<name.length(); i++) {
			if(vowelsList.contains(name.toLowerCase().charAt(i))) {
				vowelCount+=1;
			}
			else {
				consonantCount+=1;
			}
		}
		System.out.println("Vowel count in the giver string is "+ vowelCount);
		System.out.println("Consonant count in the giver string is "+ consonantCount);
	}

	public static void vowelConsonantCountWithChar(String name) {
		Map<Character, Integer> allMap = new HashMap<Character, Integer>();
		Map<Character, Integer> vowelMap = new HashMap<Character, Integer>();
		List<Character> vowelsList = Arrays.asList('a','e','i','o','u');
		for(int i=0; i<name.length(); i++) {
			if(!allMap.containsKey(name.toLowerCase().charAt(i))) {
				allMap.put(name.toLowerCase().charAt(i), 1);
			}
			else {
				allMap.put(name.toLowerCase().charAt(i), allMap.get(name.toLowerCase().charAt(i))+1);
			}
		}
		System.out.println("All char count in the given string is "+ allMap);

		for(char c : allMap.keySet()) {
			if(vowelsList.contains(c)) {
				vowelMap.put(c, allMap.get(c));
			}
		}
		System.out.println("Vowel list is " + vowelMap);
	}
	
	public static List<String> getVowelCountUsingStreams(String name) {
		List<String> list = new ArrayList<String>(Arrays.asList(name.split("")));
		List<String> list1 = list.stream().filter(e->e.equals("a") || e.equals("e") || e.equals("i") || e.equals("o") || e.equals("u")).collect(Collectors.toList());
		return list1;
	}

	public static void main(String[] args) {
		vowelConsonantCount("abcdefghijklmnopqrstuvwxyz");
		vowelConsonantCountWithChar("aabcdeff");
		List<String> ab = getVowelCountUsingStreams("aabcdeffa");
		System.out.println(ab);
	}
}	


