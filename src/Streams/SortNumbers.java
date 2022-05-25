package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNumbers {
	
	public static void main (String[] args) {
		
		List<Integer> list = Arrays.asList(1,4,3,2,5,6);
		
		list.stream().sorted().forEach(System.out::println);
		
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
	}

}
