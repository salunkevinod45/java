package loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyNumber number = new MyNumber(14);

		System.out.println("isPrime = " + number.isPrime());

		System.out.println("sum up to = " + number.sumUptoN());
		System.out.println("sum of divisors =" + number.sumOfDivisors());

		number.printANumberTrinagle();
	}

}
