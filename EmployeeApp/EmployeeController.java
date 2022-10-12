package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Employee;

import com.nissan.service.IEmployeeService;


@CrossOrigin                   //helps to avoid (cors) error
@RestController
@RequestMapping("api/")
public class EmployeeController {
	
	//field DI Injection
		@Autowired
		IEmployeeService employeeService;
		
		//List all users
		@GetMapping("employees")
		public List<Employee> findAllEmployees(){
			return employeeService.findAllEmployees();
		}
		
		
		//get by phone number
				@GetMapping("employees/{phone}")
				public Employee findByPhoneNo(@PathVariable long phone) {
					return employeeService.findByPhoneNo(phone);
				}
		//add user
				@PostMapping("employees")
					public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
						System.out.println("Inserting a record");
						return new ResponseEntity<Employee> (employeeService.addEmployee(employee),HttpStatus.OK);
					}
			
				
		//update user
				@PutMapping("users")
				public Employee updateemployee(@RequestBody Employee employee) {
					System.out.println("Updating a record");
					employeeService.updateEmployee(employee);
					return employee;
				
					
				}

		

}
