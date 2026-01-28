package conditionalIfAndSwitch;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number 1: ");

		int number1 = scanner.nextInt();



		System.out.print("Enter number 2: ");

		int number2 = scanner.nextInt();

		System.out.println("Choices available: ");

		System.out.println(" 1-Add \n 2-Subtract \n 3-Divide \n 4-Multiply");

		System.out.print("Your choice: ");

		int choice = scanner.nextInt();

		System.out.println("Your Choices are :");
		System.out.println("Number 1: " + number1);
		System.out.println("Number 2: " + number2);
		System.out.println("Choice: " + choice);

//		performOperationUsingNestedIfElse(number1, number2, choice);

		performOperationUsingSwitch(number1, number2, choice);



	}

	private static void performOperationUsingNestedIfElse(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("Result is " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result is " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result is " + (number1 / number2));
			break;
		case 4:
			System.out.println("Result is " + (number1 * number2));
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

	private static void performOperationUsingSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("Result is " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result is " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result is " + (number1 / number2));
			break;
		case 4:
			System.out.println("Result is " + (number1 * number2));
			break;
		default:
			System.out.println("Invalid operation");
		}
	}

}
