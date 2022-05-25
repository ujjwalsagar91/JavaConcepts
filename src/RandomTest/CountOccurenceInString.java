package RandomTest;

public class CountOccurenceInString {

	public static void main(String[] args) {

		String str = "I love coding";
		
//		long count = str.chars().mapToObj(e->String.valueOf((char)e)).filter(e->e.equals("o")).count();
		long count = str.chars().mapToObj(e->(char)e).filter(e->e.equals('o')).count();
		System.out.println(count);

	}

}
