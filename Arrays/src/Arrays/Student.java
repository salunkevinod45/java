package Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	int getNumberOfMarks() {
		return this.marks.length;
	}

	int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	int getMaximumMark() {
		int maxMark = marks[0];

		for (int mark : marks) {
			if (mark > maxMark) {
				maxMark = mark;
			}
		}

		return maxMark;
	}

	int getMinimumMark() {
		int minMark = marks[0];
		for (int mark : marks) {
			if (mark < minMark) {
				minMark = mark;
			}
		}

		return minMark;
	}

	BigDecimal getAverageMarks() {
		BigDecimal sum = new BigDecimal(getTotalSumOfMarks());

		BigDecimal length = new BigDecimal(getNumberOfMarks());

		BigDecimal avg = sum.divide(length, 2, RoundingMode.HALF_UP);

		return avg;

	}

}
