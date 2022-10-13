package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Customer;

import com.nissan.service.IAdminService;

@CrossOrigin                   //helps to avoid (cors) error
@RestController
@RequestMapping("api/")


public class CustomerController {

	
	//field DI Injection
		@Autowired
		IAdminService adminService;
		
		//List all users
		@GetMapping("customers")
		public List<Customer> findAllCustomers(){
			return adminService.findAllCustomers();
		}
	
		
 	     //get by phone number
		  @GetMapping("customers/{accountNo}")
		  public Customer findByAccNo(@PathVariable long accountNo)
			{
				return adminService.findByAccNo(accountNo);
			}
		  
		    //add customer
			@PostMapping("customers")
			public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
			{
				System.out.println("Inserting a record");
				return new ResponseEntity<Customer> (adminService.addCustomer(customer),HttpStatus.OK);
			}
			
				
		     //update customer
			@PutMapping("Customers")
			public Customer updateCustomer(@RequestBody Customer customer) 
				{
				System.out.println("Updating a record");
				adminService.updateCustomer(customer);
					return customer;
			}
			
			//delete customer
			@DeleteMapping("Customers")
			public Customer deleteCustomer(@RequestBody Customer customer) 
				{
				System.out.println("deleting a record");
				adminService.deleteCustomer(customer);
					return customer;
			}
					

}

