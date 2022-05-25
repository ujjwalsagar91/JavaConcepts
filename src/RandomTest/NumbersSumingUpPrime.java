package RandomTest;

public class NumbersSumingUpPrime {

	public static boolean checkPrime(int num) {

		boolean flag = true;

		if(num==0 || num==1) {
			System.out.println(num + " is not a prime number");
		}
		else {
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(num + " is a prime number");
			}
			else {
				System.out.println(num + " is not a prime number");
			}
		}
		return flag;
	}

	public static void numberSumingUpPrime(int anyNum) {

		for(int i=2; i<=anyNum/2; i++) {
			if(checkPrime(i) && checkPrime(anyNum-i)) {
				System.out.println(anyNum + " = " + i + " + " + (anyNum-i));
			}
		}
	}

	public static void main(String[] args) {


		numberSumingUpPrime(34);



	}

}
