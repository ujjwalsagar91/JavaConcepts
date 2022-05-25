package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StartsWithTwo {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,24,25,21,11);
		list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).forEach(System.out::println);
	}

}
