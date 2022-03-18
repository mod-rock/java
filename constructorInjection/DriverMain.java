package constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverMain {


	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Membership memberShip = context.getBean("membershipBean",Membership.class);
		Customer customer = context.getBean("customerBean", Customer.class);
		System.out.println(memberShip.getMembershipId());
		System.out.println(customer.getContactNo());
		
		
		
	}

}
