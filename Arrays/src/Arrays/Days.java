package Arrays;

public class Days {

	private String[] days;

	Days(String... days) {
		this.days = days;
	}

	void printReverseDays() {
		for (int i = days.length - 1; i >= 0; i--) {
			System.out.println(days[i]);
		}
	}

	String getLongestString() {
		String longestString = days[0];
		for (int i = 0; i < days.length; i++) {
			if (longestString.length() < days[i].length()) {
				longestString = days[i];
			}
		}

		return longestString;
	}

}
