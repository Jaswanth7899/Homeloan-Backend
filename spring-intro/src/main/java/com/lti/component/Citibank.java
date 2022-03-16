package com.lti.component;

import org.springframework.stereotype.Component;

@Component("citibank")
public class Citibank implements Bank{
	
	
	public void withdraw(int atmId, long accno, double amount) {
		System.out.println("Citibank recieved");
	}


}
