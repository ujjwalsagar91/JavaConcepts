package RandomTest;

public class SpecialCharacterOrAlphabet {

	public static void main(String[] args) {

		char c = 'M';

		if(c>='a' && c<='z' || c>='A' &&c<='Z') {
			System.out.println(c + " is an alphabet");
		}
		else {
			System.out.println(c + " is not alphabet");
		}
		
	}

}
