package RandomTest;

public class BMWClass extends CarInterfaceTest {
	
	public void speed() {
		System.out.println("Running in BMW");
	}

	public static void main(String[] args) {

		VehicleInterface vh1 = new BMWClass();
		vh1.engine();
		
	}

}
