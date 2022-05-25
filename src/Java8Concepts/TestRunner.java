package Java8Concepts;

public class TestRunner {

	public static void main(String args[]) {

		/*
		 * IPrintable obj1 = new ConsolePrinterImpl(); obj1.print();
		 */

		IPrintable obj2 = new IPrintable() {

			@Override
			public void print() {
				System.out.println("From Anonymous Class");
			}
		};

		IPrintable obj3 = new IPrintable() {

			@Override
			public void print() {
				System.out.println("From Anonymous Class Part 2");
			}
		};

		IPrintable obj4 = () -> System.out.println("Using Lambda");

		obj2.print();
		obj3.print();
		obj4.print();
	}

}
