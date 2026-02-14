package Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	int getNumberOfMarks() {
		return this.marks.size();
	}

	int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	int getMaximumMark() {
		return Collections.max(marks);
	}

	int getMinimumMark() {
		return Collections.min(marks);
	}

	BigDecimal getAverageMarks() {
		BigDecimal sum = new BigDecimal(getTotalSumOfMarks());

		BigDecimal length = new BigDecimal(getNumberOfMarks());

		BigDecimal avg = sum.divide(length, 3, RoundingMode.HALF_UP);

		return avg;

	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addValue(int value) {
		marks.add(value);
	}

	public void removeValueAtIndex(int index) {
		marks.remove(index);
	}

}
