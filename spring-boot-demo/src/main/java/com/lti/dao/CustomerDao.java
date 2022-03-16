package com.lti.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDao extends GenericDao {
	
	public boolean isCustomerPresent(String email) {
		return (Long) entityManager
							.createQuery("select count(c) from Customer c where c.email = :em")
							.setParameter("em", email)
							.getSingleResult() == 1 ? true : false;
	}
	
	public boolean isValidUser(String email, String password) {
		return (Long) entityManager
							.createQuery("select count(c) from Customer c where c.email = :em nad c.password = :pw")
							.setParameter("em", email)
							.setParameter("pw", password)
							.getSingleResult() == 1 ? true : false;
	}
	public int isValidUserv2(String email, String password) {
		return (Integer) entityManager
							.createQuery("select c.id from Customer c where c.email = :em nad c.password = :pw")
							.setParameter("em", email)
							.setParameter("pw", password)
							.getSingleResult();
	
	}

}
