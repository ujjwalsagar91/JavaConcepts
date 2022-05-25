package RandomTest;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyElse {

	public static void main(String[] args) {

		List<Customer> customerList = Arrays.asList(
				new Customer("Ujjwal1", 30),
				new Customer("Sagar", 31),
				new Customer("Kumar", 32)
				);
		
		Customer c1 = customerList.stream().filter(x->x.getName().equalsIgnoreCase("Ujjwal1")).findAny().orElse(null);
		System.out.println(c1.getName() + " " + c1.getAge());

	}

}
