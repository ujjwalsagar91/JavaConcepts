package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumberSquare {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,4,5,21);

		list.stream().mapToDouble(e->e).map(e->Math.pow(e, 2)).forEach(System.out::println);
		
		IntStream.range(1, 5).map(e->e*e).forEach(System.out::println);
		
		
		}

}
