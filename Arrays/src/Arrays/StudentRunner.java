package Arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		int[] marks = { 12, 45, 67 };
		Student student = new Student("Vinod", new int[] { 1, 4, 6, 98 });

		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maxMark = student.getMaximumMark();
		int minMark = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();

		System.out.println("number of marks = " + number);
		System.out.println("sum of marks = " + sum);
		System.out.println("max of marks = " + maxMark);
		System.out.println("min of marks = " + minMark);
		System.out.println("average of marks = " + average);

		System.out.println(student);

		student.addValue(872);

		System.out.println(student);

		student.removeValueAtIndex(2);

		System.out.println(student);

	}

}
