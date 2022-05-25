package RandomTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class NewTest9 { 

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		
		List list1 = list.stream().filter(x->x>5).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		
		String[] abcd = {"abc", "xyz", "def"};
		List<String> list3 = Arrays.asList(abcd);
		System.out.println(list3);
		

		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		
	}
}
