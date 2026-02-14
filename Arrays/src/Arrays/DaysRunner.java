package Arrays;

public class DaysRunner {

	public static void main(String[] args) {

		String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wedensday", "Thursday", "Friday", "Saturday" };
		Days days = new Days(weekDays);

		days.printReverseDays();

		System.out.println("longest string " + days.getLongestString());

	}

}
