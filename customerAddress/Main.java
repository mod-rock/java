package customerAddressScope.customerAddress;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer custObj = (Customer) context.getBean("customerBean",Customer.class);
		custObj.getAddress().setCity("greenville");
		System.out.println("Customer city of first customer:" + custObj.getAddress().getCity());
		
		Customer custObj1 = (Customer) context.getBean("customerBean",Customer.class);
		custObj1.getAddress().setCity("new york");
		System.out.println("Customer city of second customer:" + custObj.getAddress().getCity());
		
		context.close();
	}

}
