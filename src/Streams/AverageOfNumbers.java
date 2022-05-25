package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AverageOfNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,4,5,21);
		double avg = list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
	}

}
