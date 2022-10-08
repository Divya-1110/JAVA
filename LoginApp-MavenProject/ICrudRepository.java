package com.nissan.repo;

import java.util.Optional;

import com.nissan.model.LoginApp;


public interface ICrudRepository {
	
	  //Add a user
		void insertEntity();

		//EditUser
		 public void updateEntity();
			
			//delete User
		public void deleteEntity();
		
		//list all professor
		public void listEntity();
	
		//search by name
		public Optional<LoginApp> findByName(String Name);



}
