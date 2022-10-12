package com.nissan.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Department")


public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int deptId;
	private String deptName;

	//for one role many users
		@JsonIgnore      //Avoid recursive
		@OneToMany(mappedBy="dept")
		private List<Employee> employees;
		
		//default constructor
		public Department() {
			
		}
		
		//parameterized constructor
		public Department(int deptId, String deptName, List<Employee> employees) {
			super();
			this.deptId = deptId;
			this.deptName = deptName;
			this.employees = employees;
		}

		//getters and setters
		public int getDeptId() {
			return deptId;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}

		public List<Employee> getEmployees() {
			return employees;
		}

		public void setEmployees(List<Employee> employees) {
			this.employees = employees;
		}

		//override
		@Override
		public String toString() {
			return "Department [deptId=" + deptId + ", deptName=" + deptName + ", employees=" + employees + "]";
		}
		
		
		
		
}
