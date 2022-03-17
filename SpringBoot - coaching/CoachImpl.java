package com.coachwithAt.coaching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoachImpl {
	
	@Autowired
	//@Qualifier("track")
	private CoachInterface coachInterface;

	public CoachImpl(CoachInterface coachInterface) {
		super();
		this.coachInterface = coachInterface;
	}
	
	public String Coach() {
		return coachInterface.getAdvice();
	}
}
