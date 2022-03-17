package com.coachwithAt.coaching;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CoachingApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(CoachingApplication.class, args);
		
		CoachImpl coaching = applicationContext.getBean(CoachImpl.class);
		String result = coaching.Coach();
		System.out.println(result);
	}

}
