package RandomTest;

public class Animal {
	
	public int i = 12;
	
	public Animal() {
		i = 13;
	}

	public String toString() {
		return "Animal" + i;
	}
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		System.out.println(a1.toString());
		System.out.println(a1.i);
	}
	
}
