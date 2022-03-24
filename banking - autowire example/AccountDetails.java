package bank.banking;

import org.springframework.stereotype.Component;

@Component
public class AccountDetails {
	private int accountNum;
	private double accountBal;
	
	public void setAccountNum(int accountNum) {
		this.accountNum=accountNum;
	}
	public int getAccountNum() {
		return accountNum;
	}
	
	public void setAccountBal(double d) {
		this.accountBal=d;
	}
	public double getAccountBal() {
		return accountBal;
	}
	
	@Override
	public String toString() {
		return "Account bal: " + accountBal + " for account number: " + accountNum;
	}
}
