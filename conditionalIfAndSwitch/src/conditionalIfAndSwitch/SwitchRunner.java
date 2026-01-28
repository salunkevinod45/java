package conditionalIfAndSwitch;

import java.util.Scanner;

public class SwitchRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter day number ");
		int dayNumber = scanner.nextInt();
//		isWeekday(dayNumber);
//		int monthNumber = scanner.nextInt();
//		determinNameOfMonth(monthNumber);
		determineNameOfDay(dayNumber);
	}

	public static void isWeekday(int dayNumber) {
		switch (dayNumber) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("the day is week day");
			break;
		default:
			System.out.println("the day is not week day");
		}
	}

	public static void determinNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("invalid month");
		}
	}

	public static void determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wedensday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("invalid day number");
		}
	}

}
