package com.lti.component;

import org.springframework.stereotype.Component;

@Component("mini")
public class MiniProject {
	
	public void miniproject()
	{
		
		int miniproj_id=222;
		String miniproj_name="Spring Framework";
		System.out.println("my project id is " + miniproj_id);
		System.out.println("my project name is " + miniproj_name);
	}

}
