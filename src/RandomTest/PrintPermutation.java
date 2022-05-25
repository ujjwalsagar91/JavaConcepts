package RandomTest;

public class PrintPermutation {
	
	public static void permutation(String str1, String str2) {
		
		if(str1.length()==0) {
			System.out.println(str2 + " ");
		}
		
		for(int i=0; i<str1.length(); i++) {
			
			char ch = str1.charAt(i);
			
			String ros = str1.substring(0,i) + str1.substring(i+1);
			
			permutation(ros, str2+ch);
		}
		
	}
	
	public static void main(String[] args)  {
		permutation("abc", "");
	}

}
