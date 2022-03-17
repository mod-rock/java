package com.coachwithAt.coaching;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("track")
public class TrackCoach implements CoachInterface {
	@Override
	public String getAdvice() {
		return "Run 5k";
	}

}
