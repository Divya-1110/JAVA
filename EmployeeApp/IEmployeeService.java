package com.nissan.service;

import java.util.List;

import com.nissan.model.Employee;

public interface IEmployeeService {

	 //find all Employee
	List<Employee> findAllEmployees();
	
	//find by phone number
	public Employee findByPhoneNo(long phone);

	//insert user
	Employee addEmployee(Employee employee);
	
	//delete employee
	Employee deleteEmployee(Employee employee);
	
	//update user
	Employee updateEmployee(Employee employee);

}
