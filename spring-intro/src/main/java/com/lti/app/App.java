package com.lti.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.Atm;
import com.lti.component.CurrencyConverter;
import com.lti.component.DirhamInr;
import com.lti.component.GoodMorning;
import com.lti.component.HelloWorld;
import com.lti.component.Project;
import com.lti.component.TextEditor;

public class App {

	public static void main(String[] args) {
		// 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		//Accessing a particular beam
		HelloWorld h = (HelloWorld) ctx.getBean("hw");
		h.sayHello("Jaswanth");
		
		GoodMorning m = (GoodMorning) ctx.getBean("gm");
		m.sayGoodMorning("Jaswanth");
		
		CurrencyConverter cc = (CurrencyConverter) ctx.getBean("currconv");
		System.out.println(cc.convert("USD", "INR", 50));
		
		DirhamInr di = (DirhamInr) ctx.getBean("currcon");
		System.out.println(di.convert("Dih", "INR", 50));
		 
		TextEditor te=(TextEditor) ctx.getBean("txtEd");
	 	te.load("java.txt");
	 	
	 	Project p=(Project) ctx.getBean("pro");
	 	p.project1();
	 	
	 	Atm atm=(Atm) ctx.getBean("hdfcatm");
	 	atm.withdraw(11111111, 2000);
	 			
	}
	
}
