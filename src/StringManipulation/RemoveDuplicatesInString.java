package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesInString {
	
	public static <T> Set<T> removeDuplicates(List<T> list) {
		
		Set<T> set = new HashSet<>();
		return list.stream().filter(e->set.add(e)).collect(Collectors.toSet());
		
	}

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("w", "e", "e", "l", "c", "o", "m", "e","w");
		System.out.println(removeDuplicates(list1));
		Set<String> set1 = removeDuplicates(list1);
		List<String> list2 = new ArrayList<>(set1);
		System.out.println(list2.stream().sorted().collect(Collectors.toList()));

	}

}
