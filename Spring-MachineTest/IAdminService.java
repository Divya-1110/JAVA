package com.nissan.service;

import java.util.List;

import com.nissan.model.Customer;

public interface IAdminService {

	 //find all customers
	List<Customer> findAllCustomers();
	
	//find by Account number
	public Customer findByAccNo(long accountNo);

	//insert Customer
	Customer addCustomer(Customer customer);
	
	//delete Customer
	Customer deleteCustomer(Customer customer);
	
	//update Customer
	Customer updateCustomer(Customer customer);

}
