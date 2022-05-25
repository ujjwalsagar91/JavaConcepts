package RandomTest;

public class StringBufferTest {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("String1");
		StringBuffer sb2 = new StringBuffer("String1");
		System.out.println(sb1.toString().equals(sb2.toString()));
		sb1.append("String2");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1.toString().equals(sb2.toString()));
		

	}

}
