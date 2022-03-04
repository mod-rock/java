package BankAccountDetails;
import java.util.*;

public class AccountDetails {
	Scanner sc = new Scanner(System.in);
	
	public void getAccountDetails() {
		
		System.out.println("Enter Account id:");
		int id = sc.nextInt();
		System.out.println("Enter account type:");
		String type = sc.next();
		System.out.println("Enter Balance:");
		int bal = sc.nextInt();
		
		Account acc = new Account();
		acc.setAccountId(id);
		acc.setAccountType(type);
		
		while(true) {
			if (bal<0) {
				System.out.println("Balance should be positive");
				continue;
			}else if (bal>=0){
				acc.setBalance(bal);
				break;
			}
		}
	}
	
	public int getWithdrawAmount() {
		int amount;
		while(true) {
			System.out.println("Enter amount to be withdrawn:");
			amount = sc.nextInt();
			if(amount<=0) {
				System.out.println("Amount should be positive");
				//continue;
			}else {
				//return amount;
				break;
			}
		}
		return amount;
	}
	
	
	public static void main(String[] args) {
		AccountDetails ad = new AccountDetails();
		ad.getAccountDetails();
		Account aa = new Account();
		aa.withdraw(ad.getWithdrawAmount());
	}
}
