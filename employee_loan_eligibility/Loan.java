package employee_loan_eligibility;

public class Loan{
	public double calculateLoanAmount(Employee emp) {
		double loan;
		if(emp instanceof PermanentEmployee) {
			loan = emp.getSalary() * 0.15;
			return loan;
		}
		else if(emp instanceof TemporaryEmployee) {
			loan = emp.getSalary() * 0.10;
			return loan;
		}
		return 1.0;
	}
	
}
