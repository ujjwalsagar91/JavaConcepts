package ReverseString;

public class ReverseAStringUsingStringBuffer {

	public static void main(String arg[]) {

		String input = "123456789";
		StringBuffer output = new StringBuffer();
		output.append(input);
		System.out.println(output.reverse());
	}
}
