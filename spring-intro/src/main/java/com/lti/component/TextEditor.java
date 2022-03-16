package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEd")
public class TextEditor {
	
	@Autowired //DI
	private SpellChecker sp;
	
	public void load(String document) {
		System.out.println(document + " loaded successfully..");
		sp.checkSpelling(document);
	}

}
