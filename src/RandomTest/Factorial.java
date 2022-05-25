package RandomTest;

public class Factorial {

	public static void getFactorial(int num) {
		int fact = 1;
		for(int i = 1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial for number " + num + " is : " + fact);

	}

	public static int getFactorialUsingRecurssion(int num) {

		if (num == 0 || num == 1)
			return 1;
		else {
			return (num * getFactorialUsingRecurssion(num-1));
		}
	}


	public static void main(String[] args) {
		getFactorial(6);
		int fact = getFactorialUsingRecurssion(6);
		System.out.println(fact);

	}

}
