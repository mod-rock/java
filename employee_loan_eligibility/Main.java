package employee_loan_eligibility;

public class Main {
    public static void main(String[] args) {
    	PermanentEmployee pe = new PermanentEmployee(101,"john",90000);
    	TemporaryEmployee te = new TemporaryEmployee(102,"max",80,1200);
    	
    	Loan loan = new Loan();
    	
    	double permEmpLoan = loan.calculateLoanAmount(pe);
    	double tempEmpLoan = loan.calculateLoanAmount(te);
    	
    	System.out.println(permEmpLoan);
    	System.out.println(tempEmpLoan);
    }
}
