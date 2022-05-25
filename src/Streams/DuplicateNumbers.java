package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,2,3,3,4);
		list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet()).forEach(System.out::println);
	}

}
