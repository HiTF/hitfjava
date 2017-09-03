
public class FullTimeEmployee extends Employee{
	private double weeklySalary;
	private double benefitDeduction;
	
	public void setWeeklySalary(double weeklySalaryIn) {
		weeklySalary = weeklySalaryIn;
	}
	public double setWeeklySalary() {
		return weeklySalary;
	}
	public void setBenefitDeduction(double benefitDeductionIn) {
		benefitDeduction = benefitDeductionIn;
	}
	public double setBenefitDeduction() {
		return benefitDeduction;
	}
	public double findPaymentAmount() {
		return weeklySalary - benefitDeduction;
	}

}
