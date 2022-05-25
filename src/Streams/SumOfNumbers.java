package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,4,5,10);
		
		int asum = list.stream().mapToInt(e->e).sum();
		
		System.out.println(asum);
		
	}

}
