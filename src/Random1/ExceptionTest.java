package Random1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionTest {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		System.out.println(a + ' ' + b);
		
		String s1 = "ujjwal";
		
		List<String> list = new ArrayList<>(Arrays.asList(s1.split("")));
		
		list.forEach(System.out::println);
		
		list.forEach(e->System.out.println(e));
		
	}

}
