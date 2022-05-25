package ReverseString;

public class ReverseAStringUsingByteArray {

	public static void main(String arg[]) {

		String input = "123456789";

		byte[] temp = input.getBytes();

		byte[] output = new byte[temp.length];

		for(int i=0; i<temp.length; i++) {
			output[i] = temp[temp.length-i-1];
		}

		System.out.println(new String(output));
	}


}
