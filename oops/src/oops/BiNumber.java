package oops;

public class BiNumber {

	int number1;
	int number2;

	public BiNumber(int number1, int number2) {
		// TODO Auto-generated constructor stub
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	int add() {
		return number1 + number2;
	}

	int multiply() {
		return number1 * number2;
	}

	void doubleNum() {
		this.number1 += this.number1;
		this.number2 += this.number2;
	}

}
