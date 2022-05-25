package RandomTest;

public class NaturalNumberSumRecursion {

	public static void sumNatural(int lastNum) {

		int i = 1;
		int sum = 0;

		while(i<=lastNum) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

	public static int sumNaturalRecursion(int lastNum1) {

		if(lastNum1!=0) {
			return lastNum1+sumNaturalRecursion(lastNum1-1);
		}
		else {
			return lastNum1;
		}
	}

	public static void main(String[] args) {

		//sumNatural(100);
		System.out.println(sumNaturalRecursion(100));

	}

}
