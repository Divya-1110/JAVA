package com.nissan.service;

import com.nissan.model.Customer;

public interface ICustomerService {
	

	//deposit
	public Customer deposit(Customer customer);

	//withdraw
	Customer withdraw(Customer customer);
	
	//transfer
	Customer transfer(Customer customer);
	
	//show balance
	Customer showBalance(Customer customer);


}
