package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinm {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
	}

}
