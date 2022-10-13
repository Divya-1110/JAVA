package com.nissan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Customer;

import com.nissan.service.ICustomerService;

@CrossOrigin                   //helps to avoid (cors) error
@RestController
@RequestMapping("api/")
public class AdminController {
	//field DI Injection
			@Autowired
			ICustomerService customerService;
			
			
		     //deposit
			@PutMapping("deposit")
			public Customer deposit(@RequestBody Customer customer) 
				{
				System.out.println("amount deposited");
				customerService.deposit(customer);
					return customer;
			}
			  //withdraw
			@PutMapping("withdraw")
			public Customer withdraw(@RequestBody Customer customer) 
				{
				System.out.println("amount withdrawn");
				customerService.withdraw(customer);
					return customer;
			}
			  //Money transfer
			@PutMapping("transfer")
			public Customer transfer(@RequestBody Customer customer) 
				{
				System.out.println("amount transfered");
				customerService.transfer(customer);
					return customer;
			}
			  //show balance
			@PutMapping("show balance")
			public Customer showBalance(@RequestBody Customer customer) 
				{
				System.out.println("Display balance");
				customerService.showBalance(customer);
					return customer;
			}
		

}
