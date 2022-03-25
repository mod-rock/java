package CurrencyConverterGroup.CurrencyConverter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CurrencyConverter currencyConverter = (CurrencyConverter) context.getBean("currencyConverter");
		System.out.println(currencyConverter.getTotalCurrencyValue("5Dollar"));
		context.close();
	}

}
