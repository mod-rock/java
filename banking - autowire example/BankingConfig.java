package bank.banking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BankingConfig {
	
	@Bean
	public CustomerDetails customerDetails() {
		CustomerDetails cd = new CustomerDetails();
		
		cd.setCustomerId(564);
		cd.setCustomerName("macroon");
		
		return cd;
	}
	
	@Bean
	public AccountDetails passAcc() {
		AccountDetails accountdetails = new AccountDetails();
		
		accountdetails.setAccountNum(86654321);
		accountdetails.setAccountBal(500000.50);
		
		return accountdetails;
	}
	
}
