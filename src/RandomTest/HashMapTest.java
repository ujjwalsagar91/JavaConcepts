package RandomTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest{
	    public static void main(String[] args) {
	    	HashMap<String, String> map1 = new HashMap<>();
	    	map1.put("Ujjwal", "Sagar");
	    	map1.put("Abhishek", "Kumar");
	    	map1.put("Mamta", null);
	    	map1.put(null, "Kumari");
	    	
	    	Map<String, String> map2 = Collections.synchronizedMap(map1);	    	
	    	synchronized (map1) {
				System.out.println("My map is synchronized");
			}
	    	
	    	for(Map.Entry<String, String> es : map1.entrySet()) {
	    		System.out.println("FirstName - " + es.getKey() + " LastName - " + es.getValue());
	    	}
	    	
	    }
	}
