package RandomTest;

import java.util.stream.IntStream;

/**
 * @author sagaru
 *
 */
public class NewTest6 {  
	
	public static void printNum(int num1, int lastNum) {
//		System.out.println(num1);
//		num1++;
//		if(num1<=lastNum) {
//		printNum(num1, lastNum);
//		}
		
		IntStream.range(1, 101).forEach(e->System.out.println(e));
	}

	    public static void main(String[] args)
	    {
	    	printNum(1,100);
	    }
	}