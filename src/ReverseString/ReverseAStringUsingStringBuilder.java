package ReverseString;

public class ReverseAStringUsingStringBuilder {

	public static void main(String arg[]) {

		String input = "123456789";
		StringBuilder output = new StringBuilder(input);
		System.out.println(output.reverse());
	}
}
