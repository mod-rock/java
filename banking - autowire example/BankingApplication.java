package bank.banking;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankingApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BankingConfig.class);
		
		CustomerDetails cust = (CustomerDetails) context.getBean(CustomerDetails.class);
		
		System.out.println("customer id: " + cust.getCustomerId());
		System.out.println("customer name: " + cust.getCustomerName());
		System.out.println(cust.getPassAcc().toString());
		
		context.close();
	}

}
