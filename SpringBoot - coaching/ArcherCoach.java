package com.coachwithAt.coaching;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Qualifier("archer")
public class ArcherCoach implements CoachInterface {

	@Override
	public String getAdvice() {
		
		return "Shoot 15 arrows";
	}

}
