package bank.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDetails {
	private String customerName;
	private int customerId;
	
	@Autowired
	private AccountDetails passAcc;
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	
	public void setPassAcc(AccountDetails passAcc) {
		this.passAcc=passAcc;
	}
	public AccountDetails getPassAcc() {
		return passAcc;
	}
	
}
