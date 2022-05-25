package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SkipAndLimit {
	
	public static void main (String[] args) {
		
		List<Integer> list = Arrays.asList(1,4,3,2,5,6);
		
		list.stream().skip(2).forEach(System.out::println);
		
		list.stream().limit(4).forEach(System.out::println);
		
	}

}
