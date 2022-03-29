package custAddress.custAddressInnerBean;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static AddressBook loadAddressBook() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		AddressBook addressBook = (AddressBook) context.getBean("addressbook");
		context.close();
		return addressBook;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		AddressBook addressBook = loadAddressBook();
		
		System.out.println("Enter the temporary address\n" + "Enter the house name");
		String houseName = sc.nextLine().trim();
		System.out.println("Enter the street");
		String street = sc.nextLine().trim();
		System.out.println("Enter the city");
		String city = sc.nextLine().trim();
		System.out.println("Enter the state");
		String state = sc.nextLine().trim();
		System.out.println("Enter the phone number");
		String phoneNumber = sc.next();
		
		sc.close();
		
		addressBook.getAddress().setHouseName(houseName);
		addressBook.getAddress().setStreet(street);
		addressBook.getAddress().setCity(city);
		addressBook.getAddress().setState(state);
		addressBook.setPhoneNumber(phoneNumber);
		
		System.out.println("Temporary address");
		System.out.println("House name:" + addressBook.getAddress().getHouseName());
		System.out.println("Street:" + addressBook.getAddress().getStreet());
		System.out.println("City:" + addressBook.getAddress().getCity());
		System.out.println("State:" + addressBook.getAddress().getState());
		System.out.println("Phone number :" + addressBook.getPhoneNumber());
	}

}
