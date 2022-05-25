package ArraysManipulation;

import java.util.HashSet;

public class FindDuplicatesUsingHashSet {

	public static void main(String args[]) {

		int input[] = {1,2,3,4,5,5,5,38};

		HashSet<Integer> set = new HashSet<>();

		for(int i : input) {
			if(!set.add(i)) {
				System.out.println(i);
			}
		}
	}

}
