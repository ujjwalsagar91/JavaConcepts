package Streams;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {
	
	public static void main (String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		
		list1.stream().mapToInt(e->e).filter(e->e%2!=0).forEach(System.out::println);
		
	}

}
