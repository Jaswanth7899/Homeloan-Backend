package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pro")
public class Project {
	
	@Autowired
	private MiniProject m1;
	
	public void project1()
	{
		 int proj_id= 212;
		 String proj_name="Facial Reognition";
		 System.out.println("my project id is " + proj_id);
		 System.out.println("my project name is " + proj_name);
		 m1.miniproject();
	}
	

}
