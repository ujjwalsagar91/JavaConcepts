package Random1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapListConversion {

	public static void main(String[] args) throws IOException {

		List<String> addressList = new ArrayList<>();
		addressList.add("Bokaro");
		addressList.add("Pune");
		
		Map<String, Object> map1 = new HashMap<>();
		map1.put("firstName", "Ujjwal");
		map1.put("lastName", "Sagar");
		map1.put("address", addressList);
		
		System.out.println(map1);
		
//		ObjectMapper objMap = new ObjectMapper();
//		String json = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(map1);
//		System.out.println(json);
		
//		Map<String, Object> map2 = objMap.readValue(new File("C:\\Users\\sagaru\\eclipse-workspace\\JavaLearnings\\src\\Random1\\test.json"), new TypeReference<Map<String, Object>>() {
//		});
		
//		System.out.println(map2.get("firstName"));
//		List<String> address = (List<String>) map2.get("address");
//		System.out.println(address);
//		System.out.println(address.get(0));
	}

}
