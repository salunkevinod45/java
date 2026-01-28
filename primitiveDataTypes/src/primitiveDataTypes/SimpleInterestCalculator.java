package primitiveDataTypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principle;
	BigDecimal interest;

	public SimpleInterestCalculator(String principle, String interest) {
		// TODO Auto-generated constructor stub
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest);

	}

	BigDecimal calculateTotalValue(int years) {
		BigDecimal noOfYears = new BigDecimal(years);
		return this.principle
				.add((this.principle.multiply(this.interest).multiply(noOfYears)).divide(new BigDecimal("100")));

	}
}
