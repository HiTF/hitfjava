
public class PartTimeExployee  extends Employee{
	private double hourlyRate;
	
	public void setHourlyRate(double rateIn) {
		hourlyRate = rateIn;
	}
	public double setHourlyRate() {
		return hourlyRate;
	}
	public double findPaymentAmount(int hours) {
		return hourlyRate * hours;
	}

}
