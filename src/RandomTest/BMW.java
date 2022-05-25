package RandomTest;

public class BMW extends Car {
	
	public void speed() {
		System.out.println("Runnoing in BMW");
	}

	public static void main(String args[]) {
		
		BMW bmw = new BMW();
		bmw.speed();
		bmw.body();
		bmw.engine();
		
		
		Car car = new Car();
		car.body();
		car.engine();
		
		Car bmwcar = new BMW();
		bmwcar.body();
		bmwcar.engine();
		
		Vehicle bmwVehicle = new BMW();
		bmwVehicle.engine();
		
	}
	
}
