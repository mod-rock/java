package employee_loan_eligibility;

public class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}
	
	public void setHourlyWorked(int hourlyWorked) {
		this.hoursWorked=hourlyWorked;
	}
	
	public int getHourlyWorked() {
		return hoursWorked;
	}
	
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages=hourlyWages;
	}
	
	public int getHourlyWages() {
		return hourlyWages;
	}
	
	@Override
	public void calculateSalary() {
		double salary = hoursWorked * hourlyWages;
		setSalary(salary);
	}
	
}
