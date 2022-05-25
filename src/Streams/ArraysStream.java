package Streams;

import java.util.Arrays;

public class ArraysStream {
	
	public static void main (String[] args) {
		
		String[] names = {"Ujjwal", "Kumar", "Sagar", "Utkarsh"};
		
		Arrays.stream(names).filter(x->!x.startsWith("U")).forEach(System.out::println);
		
	}

}
