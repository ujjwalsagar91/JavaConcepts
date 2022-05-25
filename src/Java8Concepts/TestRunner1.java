package Java8Concepts;

public class TestRunner1 {

	public static void main(String args[]) {

		/*
		 * IPrintable obj1 = new ConsolePrinterImpl(); obj1.print();
		 */

		IPrintable1 obj2 = new IPrintable1() {

			@Override
			public String print(String a) {
				System.out.println("From Anonymous Class");
				return "From Anonymous Class return "+a;
			}
		};

//		if the method has single argument, then no need to have brackets for the variable in lambda
		IPrintable1 obj3 = s -> "From Lambda Expression return "+s; 

		IPrintable1 obj4 = name -> {
			System.out.println("Using multiple lines in Lambda");
			return "From Lambda expression with multiple lines "+ name;
		};

		System.out.println(obj2.print("Test"));
		System.out.println(obj3.print("Test"));
		System.out.println(obj4.print("Test"));
	}

}
