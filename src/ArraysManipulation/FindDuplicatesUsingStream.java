package ArraysManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStream {

	public static void main(String args[]) {
		
		int input[] = {1,2,3,4,5,5,5};
		
		List<Integer> list = new ArrayList<>();
		
		for(int e : input) {
			list.add(e);
		}

		Set result = findDuplicatesUsingStream(list);
		
		result.forEach(System.out::println);
	}
	
	public static <T> Set<T> findDuplicatesUsingStream(List<T> list) {
		Set<T> set = new HashSet<>();
		return list.stream().filter(i->set.add(i)).collect(Collectors.toSet());
	}

}
