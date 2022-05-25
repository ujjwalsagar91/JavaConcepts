package RandomTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatArrays {  
	    public static void concateTwoArrays(String[] str1, String[] str2)
	    {
	        List<String> list1 = Arrays.asList(str1);
	        List<String> list2 = Arrays.asList(str2);
//	        List<String> list3 = new ArrayList<>();
//	        list3.addAll(list1);
//	        list3.addAll(list2);
//	        System.out.println(list3);
	        
	       List abc = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
	       System.out.println(abc);
	    }

	    public static void main(String[] args)
	    {
	        
	        String[] str1 = {"Rohit", "Dhawan"};
	        String[] str2 = {"Virat", "Shreyas"};
	        concateTwoArrays(str1, str2);
	    }
	}