package com.lti.component;

import org.springframework.stereotype.Component;

@Component("currcon") //alternative to <bean id="currconv" class="com.lti.component.CurrencyConverter>
public class DirhamInr {
	
	public double convert(String from, String to , double amount) {
		if(from.equals("Dih") && to.equals("INR"))
			return amount * 20.72;
		else
			return -1; //instead throw exception

	}
}
