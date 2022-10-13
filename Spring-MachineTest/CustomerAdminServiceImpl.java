package com.nissan.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Customer;
import com.nissan.repo.ICustomerRepository;

@Service
public class CustomerAdminServiceImpl implements IAdminService, ICustomerService 
{
	//field injection
			@Autowired(required=true)
			ICustomerRepository customerRepo;
			
	//list all customers
			@Override
			public List<Customer> findAllCustomers() {
				 return (List<Customer>) customerRepo.findAll();
			}

    //Search by account number
	         @Override
	         public Customer findByAccNo(long accountNo)
	         {
		       Customer _customer=customerRepo.findByAccNo(accountNo);

		         if(accountNo==_customer.getAccountNo()) { 
			        return _customer;}
		         else {
				       return null;
			          }
	          }

	//Add Customer
	         @Override
	         public Customer addCustomer(Customer customer)
	         {
		          return customerRepo.save(customer);
             }

	//delete Customer
	     @Override
	    public Customer deleteCustomer(Customer customer) 
	     {
		    customerRepo.delete(customer);
		    System.out.println("Deleted Successfully..!!");
		    return null;
	     }

	//update customer
	    @Override
	    public Customer updateCustomer(Customer customer) 
	    {
		      return customerRepo.save(customer);
	    }

    //deposit
	    @Override
	    public Customer deposit(Customer customer) {
		      return customerRepo.save(customer);
	     }

    //withdraw
	    @Override
	    public Customer withdraw(Customer customer) {
		      return customerRepo.save(customer);

	     }

     //transfer
	     @Override
	public Customer transfer(Customer customer) {
		      return customerRepo.save(customer);

	}

     //show balance
	@Override
	public Customer showBalance(Customer customer) {
	      return customerRepo.save(customer);

	}

}

	

