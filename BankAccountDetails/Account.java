package BankAccountDetails;

public class Account {
	private int accountId;
	private String accountType;
	private int balance;
	
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public int getAccountId() {
		return accountId;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		int bal = balance;
		//if(bal >= amount) {
			bal -= amount;
			System.out.println("Balance amount after withdraw:" + balance);
			//return true;
		//}//else if (bal < amount){
		//	System.out.println("Sorry!! No enough balance");
		//	return true;
		//}//else {
		//	return false;
		//}
	}
}
