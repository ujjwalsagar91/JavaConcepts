package RandomTest;

import java.util.ArrayList;
import java.util.List;

public class CountWordsInASentence {
	
	public static void countWords(String str) {
		
		int count=0;
		List<Integer> list1 = new ArrayList<Integer> ();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				count++;
				list1.add(i);
			}
		}
		System.out.println("Total words are : " + count);
		System.out.println("Words start at indexes : " + list1);
		
		for(int i=0; i<count; i++) {
			try {
			String sub1 = str.substring(list1.get(i),list1.get(i+1));
			System.out.println(sub1);
			}
			catch (IndexOutOfBoundsException e) {
				String sub1 = str.substring(list1.get(i));
				System.out.println(sub1);
			}
		}
	}

	public static void main(String[] args) {

		countWords("UjjwalKumarSagar");

	}

}
