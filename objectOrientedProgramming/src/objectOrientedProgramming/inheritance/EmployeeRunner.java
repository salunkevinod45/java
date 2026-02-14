package objectOrientedProgramming.inheritance;

import java.math.BigDecimal;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Vinod Salunke");
		emp.setEmail("vinodsalunke45@gmail.com");
		emp.setPhone("9970149983");
		emp.setTitle("Senior software Engineer");
		emp.setEmployer("Vanderlande");
		emp.setEmployeeGrade('A');
		emp.setSalary(new BigDecimal("459999"));

		System.out.println(emp);
	}

}
