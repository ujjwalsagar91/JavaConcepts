package RandomTest;

public class PrimeNumber {

	public static void checkPrime(int num) {

		boolean flag = true;

		if(num==0 || num==1) {
			System.out.println(num + " is not a prime number");
		}
		else {
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
					flag=false;
				}
			}
			if(flag) {
				System.out.println(num + " is a prime number");
			}
			else {
				System.out.println(num + " is not a prime number");
			}
		}
	}

	public static void main(String[] args) {


		checkPrime(2);


	}

}
