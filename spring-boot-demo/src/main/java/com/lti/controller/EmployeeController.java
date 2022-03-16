package com.lti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/emp-data.api")
	public Employee check() {
	Employee emp = new Employee();
	emp.setEmpno(1010);
	emp.setName("jaswanth");
	emp.setSalary(5000);
	return emp;
	}
	
	

}
