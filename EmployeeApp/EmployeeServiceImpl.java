package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Employee;

import com.nissan.repo.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	//field injection
		@Autowired(required=true)
		IEmployeeRepository employeeRepo;


	//list all employees
	@Override
	public List<Employee> findAllEmployees() {
		 return (List<Employee>) employeeRepo.findAll();

	}

	
	//Search by phone number
	@Override
	public Employee findByPhoneNo(long phone) {
		Employee _employee=employeeRepo.findByPhoneNo(phone);

		if(phone==_employee.getPhone()) { 
			return _employee;}
			else {
				return null;
			}

	}

	@Override
	@Transactional
	public Employee addEmployee(Employee employee) {
			
			return employeeRepo.save(employee);
			
		
	}

	@Override
	
	public Employee deleteEmployee(Employee employee) {
		
		return null;
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);

}
	
}
