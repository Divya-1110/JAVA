package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//jpa to map this model class to professor table in db

	@Entity
	@Table(name="LoginApp")

public class LoginApp {

		//declare variables
		@Id                                                    //FOR PRIMARY KEY
		@GeneratedValue(strategy=GenerationType.IDENTITY)       //FOR AUTO GENERATING
		private int userId;
		private String userName;
		private String password;
		private int roleId;
		private LocalDate createdDate;
		
		//default constructor
		public LoginApp() {
			
		}

		//parameterized constructor
		public LoginApp(int userId, String userName, String password, int roleId, LocalDate createdDate) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.password = password;
			this.roleId = roleId;
			this.createdDate = createdDate;
		}

		//getters and setters
		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getRoleId() {
			return roleId;
		}

		public void setRoleId(int roleId) {
			this.roleId = roleId;
		}

		public LocalDate getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(LocalDate createdDate) {
			this.createdDate = createdDate;
		}

		//override toString
		@Override
		public String toString() {
			return "LoginApp [UserId=" + userId + ", UserName=" + userName + ", password=" + password + ", roleId="
					+ roleId + ", createdDate=" + createdDate + "]";
		}
		
		



}
