package RandomTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewTest8 { 

	public static void main(String[] args) {

		int[] num1 = {1,2,3};
		int num2[] = {3,4,5};
		Integer[] num3 = new Integer[num1.length+num2.length];
		
		
		System.out.println(num3.length);
		
//		String s1 = null;
//		System.out.println(s1.equals("book"));
//		System.out.println("book".equals(s1));
		
		String s1 = "coding";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s1.equals(s2));
		
	}
}
