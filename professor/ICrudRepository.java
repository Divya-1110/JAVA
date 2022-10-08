package com.nissan.repo;

import java.util.Optional;

import com.nissan.model.Professor;

public interface ICrudRepository {

	
	     //create a professor
	void insertEntity();

	
		//list all professor
		public void listofProfessor();
		
		//update professor
	 public void updateEntity();
		
		//delete professor
	public void deleteEntity();
	
		//search by id
	public void findEntity();
	
	//search by name
	public Optional<Professor> findByName(String Name);


}
