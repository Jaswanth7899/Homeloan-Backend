package com.lti.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;
import com.lti.exception.CustomerServiceException;

@Component
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	
	public int register(Customer customer) {
		if(customerDao.isCustomerPresent(customer.getEmail()))
			throw new CustomerServiceException("Customer already registered!");
		else {
			Customer updatedCustomer = (Customer) customerDao.save(customer);
			return updatedCustomer.getId();
		}
			
	}

}
