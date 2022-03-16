package com.lti.component;

import org.springframework.stereotype.Component;

@Component("spck")
public class SpellChecker {
	
	public void checkSpelling(String document) {
		System.out.println("spelling check done for " + document + " successfully..");
	}

}
