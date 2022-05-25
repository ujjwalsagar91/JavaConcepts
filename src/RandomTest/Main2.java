package RandomTest;

public class Main2 extends Main1{
	
	public void eat() {
		System.out.println("Eating in Main2 class");
	}
	
	public static void main(String args[]) {
		Main2 m = new Main2();
		new Main1(1, "rt", 2.4f);
		m.eat();
		
	}
}
