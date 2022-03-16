package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfcatm")
public class HdfcAtm implements Atm{
	
	@Autowired
	private Bank bank; //loose coupling
	//private Citibank bank; //tight coupling
	
	public void withdraw(long acno, double amount) {
		System.out.println("Hdfc Atm, withdraw caalled...");
		bank.withdraw(123, acno, amount);
	}


}
