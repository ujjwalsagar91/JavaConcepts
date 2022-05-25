package ArraysManipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesUsingHashMap {

	public static void main(String args[]) {

		int input[] = {1,2,3,4,5,5,5,38};

		findDuplicates(input);

	}

	public static void findDuplicates(int[] input) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int element : input) {
			if(map.get(element) == null) {
				map.put(element, 1);
			}
			else {
				map.put(element, map.get(element)+1);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();

		for(Entry<Integer, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println("Duplicate Element - " + entry.getKey() + " found " + entry.getValue() + " times");
			}
		}
	}
}

