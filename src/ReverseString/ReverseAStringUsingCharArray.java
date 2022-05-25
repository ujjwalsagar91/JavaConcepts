package ReverseString;

public class ReverseAStringUsingCharArray {

	public static void main(String arg[]) {

		String input = "123456789";
		char[] ch = input.toCharArray();

		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}
}
