package ArraysManipulation;

public class FindDuplicatesUsingBruteForce {
	
	public static void main(String args[]) {
		
		int input[] = {1,2,3,4,5,5,5,38};
		
		for(int i=0; i<=input.length; i++) {
			for(int j=i+1; j<input.length; j++) {
				if(input[i]==input[j]) {
					System.out.println(input[j]);
				}
			}
		}
		
	}

}
