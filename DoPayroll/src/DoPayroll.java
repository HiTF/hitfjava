
/*import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class DoPayroll {
	public static void main(String[] args) throws IOException {
		Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"));
		for (int empNum = 1; empNum <= 3; empNum++) {
				payOneEmployee(diskScanner);
				}
		}
	static void payOneEmployee(Scanner aScanner) {
		Employee anEmployee = new Employee();
		anEmployee.setName(aScanner.nextLine());
		anEmployee.setJobTitle(aScanner.nextLine());
		anEmployee.cutCheck(aScanner.nextDouble());
		aScanner.nextLine();
	}
}
*/
class DoPayroll {
	public static void main(String[] args) {
		FullTimeEmployee ftEmployee = new FullTimeEmployee();
		ftEmployee.setName("Barry");
		ftEmployee.setJobTitle("President");
		ftEmployee.setWeeklySalary(5000.0);
		ftEmployee.setBenefitDeduction(500.0);
		ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
		System.out.println();
		
		PartTimeExployee ptExployee = new PartTimeExployee();
		ptExployee.setName("Steave");
		ptExployee.setJobTitle("programmer");
		ptExployee.setHourlyRate(7.23);
		ptExployee.cutCheck(ptExployee.findPaymentAmount(10));
		
	}
}