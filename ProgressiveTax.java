package myProject;

public class ProgressiveTax {
	public double income;
	public double tax;
	
	public ProgressiveTax() {
	}
	
	void setTheIncome (double a) {
	income = a;
	}
	
	public double getTheIncome() {
	return income;
	}
	
	void calculateTheTax() {
		double x = income;
		if (x < 10000) {
			tax = x * 0;
		} else if (10000 < x && x < 30000) {
			tax = (x-10000) * 0.1 + 10000 * 0;
		} else if (3000 < x && x < 100000) {
			tax = (x - 30000) * 0.25 + (30000-1000) * 0.1 + 10000 * 0;
		} else if (x > 100000 && x<1000000000) {
			tax = (x - 100000) * 0.4 + (100000-30000) * 0.25 + (30000-10000) * 0.1 + 10000 * 0;
		}
		System.out.println("You'll pay " + Math.floor(tax) + " of taxes.");
	}
	
	public static void main(String[] args) {
		ProgressiveTax test = new ProgressiveTax();
		test.setTheIncome(72546.67);
		test.calculateTheTax();	
	}

}
