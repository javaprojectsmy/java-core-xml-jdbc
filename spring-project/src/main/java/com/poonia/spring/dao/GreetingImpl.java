package com.poonia.spring.dao;

import java.util.Calendar;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.poonia.spring.model.Greeting;

//@Component
public class GreetingImpl implements Greeting {
	// @Autowired
	Date date;

	// @Autowired
	// Calendar calendar;
	//
	public String greeting() {
		// int hour=calendar.get(Calendar.HOUR_OF_DAY);
		return (1 < 12) ? "Good Morning" : "Good Evening" + date;
	}

}
