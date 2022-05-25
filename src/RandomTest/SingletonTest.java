package RandomTest;

import java.util.HashMap;
import java.util.Map;

public class SingletonTest {
	
	private static SingletonTest instance = null;
	
	private SingletonTest() {
		
	}
	
	public static SingletonTest getInstance() {
		if(instance==null) {
			instance = new SingletonTest();
		}
		return instance;
	}

}
