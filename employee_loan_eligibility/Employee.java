package employee_loan_eligibility;

public abstract class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	public Employee(int employeeId, String employeeName) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	
	
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public abstract void calculateSalary();
}
