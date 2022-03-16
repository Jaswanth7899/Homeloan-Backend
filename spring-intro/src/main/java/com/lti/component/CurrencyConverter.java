package com.lti.component;

import org.springframework.stereotype.Component;

@Component("currconv") //alternative to <bean id="currconv" class="com.lti.component.CurrencyConverter>
public class CurrencyConverter {
	
	public double convert(String from, String to , double amount) {
		if(from.equals("USD") && to.equals("INR"))
			return amount * 76.14;
		else
			return -1; //instead throw exception
		
	}

}
