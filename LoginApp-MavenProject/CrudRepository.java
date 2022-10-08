package com.nissan.repo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.nissan.model.LoginApp;



public class CrudRepository implements ICrudRepository {

	public void insertEntity() {
		//EntityManagerFactory
		EntityManagerFactory emf=null;
		EntityManager entitymanager=null;
		EntityTransaction transaction=null;
		
		Scanner s=new Scanner(System.in);
		
		//Start process
		try {
			emf=Persistence.createEntityManagerFactory("DemoEmpDB");
			entitymanager=emf.createEntityManager();
			transaction=entitymanager.getTransaction();
			
			//Start transaction
			transaction.begin();
			
			//create an object of professor
			LoginApp loginapp=new LoginApp();
			
			
			//get input from user
			System.out.println("EnterUser Name:");
			loginapp.setUserName(s.nextLine());
			
			System.out.println("Enter password:");
			loginapp.setPassword(s.nextLine());
			
			System.out.println("Enter role Id:");
			loginapp.setRoleId(Integer.parseInt(s.nextLine()));
			
			System.out.println("Enter the created date (yyy-mm-dd):");
			loginapp.setCreatedDate(LocalDate.parse(s.nextLine()));
			
			//ORM
			entitymanager.persist(loginapp);
			
			//DB
			transaction.commit();
		
			
		}
		catch(Exception e) {
			transaction.rollback();
		}
		finally {
			emf.close();
		}


	}

	public void updateEntity() {
      
		//EntityManagerFactory
				EntityManagerFactory emf=null;
				EntityManager entitymanager=null;
				EntityTransaction transaction=null;
				
				try {
					emf=Persistence.createEntityManagerFactory("DemoEmpDB");
					entitymanager=emf.createEntityManager();
					transaction=entitymanager.getTransaction();
					
					//Start transaction
					transaction.begin();
					
					Scanner input =new Scanner(System.in);
					
					//search
					System.out.println("enter the user id:");
					int id=Integer.parseInt(input.nextLine());
					
					//select from entity manager
					LoginApp lapp=entitymanager.find(LoginApp.class,id);
					
					
					//change user name
					System.out.println("Enter user name:");
					lapp.setUserName(input.nextLine());
					
					
					//commit
					entitymanager.getTransaction().commit();
					
					//after update
					System.out.println(lapp);
					
					
				}
				catch(Exception e) {
					transaction.rollback();
				}
				finally {
					emf.close();
				}

	}

	public void deleteEntity() {
		
		//EntityManagerFactory
 		EntityManagerFactory emf=null;
 		EntityManager entitymanager=null;
 		EntityTransaction transaction=null;
 		
 		try {
 			emf=Persistence.createEntityManagerFactory("DemoEmpDB");
 			entitymanager=emf.createEntityManager();
 			transaction=entitymanager.getTransaction();
 			
 			//Start transaction
 			transaction.begin();
 			
 			Scanner input =new Scanner(System.in);
 			
 			//search
 			System.out.println("enter the user id:");
 			int id=Integer.parseInt(input.nextLine());
 			
 			//select from entity manager
 			LoginApp del=entitymanager.find(LoginApp.class, id);
 					
 		    entitymanager.remove(del);
 			
 			
 			//commit
 			entitymanager.getTransaction().commit();
 			
 			//after update
 			System.out.println("Record Deleted Successfully!..");
 			
 			
 			
 		}
 		catch(Exception e) {
 			transaction.rollback();
 		}
 		finally {
 			emf.close();
 		}



		
	}

	public void listEntity() {
      
		//EntityManagerFactory
				EntityManagerFactory emf=null;
				EntityManager entitymanager=null;
			
				try {
					emf=Persistence.createEntityManagerFactory("DemoEmpDB");
					entitymanager=emf.createEntityManager();

					//list of professor
					//JPQL-java persistence query language
					entitymanager.createQuery("from Professor");
					List<LoginApp> listall=entitymanager.createQuery("from LoginApp").getResultList();
					
					for(LoginApp listone:listall) {
						System.out.println("UserId:"+listone.getUserId());
						System.out.println("UserName:"+listone.getUserName());
						System.out.println("Password:"+listone.getPassword());
						System.out.println("RoleID:"+listone.getRoleId());
						System.out.println("Created Date:"+listone.getCreatedDate());

					}
				}
				catch(Exception e){
					e.printStackTrace();
				}
				finally {
			      entitymanager.close();
			      emf.close();
				}
				
			
				

	}

	public Optional<LoginApp> findByName(String Name) {
		 EntityManagerFactory emf=null;
	        EntityManager entityManager=null;
	        
	        
	        try {
	            emf=Persistence.createEntityManagerFactory("DemoEmpDB");
	            entityManager=emf.createEntityManager();
	            
	        
	            LoginApp byname=entityManager.createQuery("SELECT p FROM LoginApp p where p.userName:name",LoginApp.class)
	                    .setParameter("name",Name)
	                    .getSingleResult();
	            return (Optional<LoginApp>)(byname!=null?Optional.of(byname):Optional.empty());
	        
	    }
	        catch(Exception ex) {
	            ex.printStackTrace();
	        }
	        finally {
	            entityManager.close();   
	        }
	        return Optional.empty();
	    }



	}

