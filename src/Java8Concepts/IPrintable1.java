package Java8Concepts;

public interface IPrintable1 {
	
	public abstract String print(String name);
	
	static void scan() {
		System.out.println("Printing something");
	}
	
	default void test1() {
		System.out.println("Default method");
	}
}
