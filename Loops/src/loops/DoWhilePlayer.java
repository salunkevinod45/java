package loops;

import java.util.Scanner;

public class DoWhilePlayer {

	public void PlayAndFindCube() {

		int number = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			if (number > 0) {
				System.out.println("Cube is " + (number * number * number));
			}

			System.out.print("Enter a number : ");
			number = scanner.nextInt();
		} while (number > 0);
		System.out.println("Thank You!have a fun");

	}
}
