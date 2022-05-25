package ReverseString;

public class ReverseAStringUsingStringFunc {

	public static void main(String arg[]) {

		String input = "123456789";
		String output="";
		char ch;

		for(int i=0; i<input.length(); i++) {
			ch = input.charAt(i);
			output = ch+output;
		}
		System.out.println(output);
	}
}
