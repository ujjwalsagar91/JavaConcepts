package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondHighestLowest {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,98,5,200,18,201);

		Optional<Integer> secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst();
		
		System.out.println(secondHighest.get());
		
	}

}