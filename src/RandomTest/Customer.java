package RandomTest;

public class Customer {
	
	String name;
	int age;
	
	public Customer(String n, int a) {
		this.name=n;
		this.age=a;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
	}
	
}
