package com.nissan.repo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.nissan.model.Professor;

public class CrudRepositoryImpl implements ICrudRepository {
	
	//add a professor
	public void insertEntity(){
		
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
		Professor professor=new Professor();
		
		
		//get input from user
		System.out.println("Enter professor FirstName:");
		professor.setFirstName(s.nextLine());
		
		System.out.println("Enter professor LastName:");
		professor.setLastName(s.nextLine());
		
		System.out.println("Enter the deptno:");
		professor.setDeptNo(Integer.parseInt(s.nextLine()));
		
		System.out.println("Enter the salary:");
		professor.setSalary(Integer.parseInt(s.nextLine()));
		
		System.out.println("Enter the joining date(yyy-mm-dd):");
		professor.setJoinDate(LocalDate.parse(s.nextLine()));
		
		System.out.println("Enter the  date of birth (yyy-mm-dd):");
		professor.setDateOfBirth(LocalDate.parse(s.nextLine()));
		
		System.out.println("Enter the Gender:");
		professor.setGender(s.nextLine());
		
		//ORM
		entitymanager.persist(professor);
		
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

	//list all professors
	public void listofProfessor() {
		
		//EntityManagerFactory
		EntityManagerFactory emf=null;
		EntityManager entitymanager=null;
	
		try {
			emf=Persistence.createEntityManagerFactory("DemoEmpDB");
			entitymanager=emf.createEntityManager();

			//list of professor
			//JPQL-java persistence query language
			entitymanager.createQuery("from Professor");
			List<Professor> professors=entitymanager.createQuery("from Professor").getResultList();
			
			for(Professor professor:professors) {
				System.out.println("ProfessorId:"+professor.getProfessorId());
				System.out.println("FirstNAme:"+professor.getFirstName());
				System.out.println("Lst Name:"+professor.getLastName());
				System.out.println("DeptNo:"+professor.getDeptNo());
				System.out.println("SAlary:"+professor.getSalary());
				System.out.println("Gender:"+professor.getGender());

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

	//update professor
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
			System.out.println("enter the id:");
			int id=Integer.parseInt(input.nextLine());
			
			//select from entity manager
			Professor pro=entitymanager.find(Professor.class,id);
			
			
			//change first and last name
			System.out.println("Enter first name:");
			pro.setFirstName(input.nextLine());
			
			System.out.println("eneter last name");
			pro.setLastName(input.nextLine());
			
			
			//commit
			entitymanager.getTransaction().commit();
			
			//after update
			System.out.println(pro);
			
			
			
		}
		catch(Exception e) {
			transaction.rollback();
		}
		finally {
			emf.close();
		}

		
		
	}

   //delete professor
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
	 			System.out.println("enter the id:");
	 			int id=Integer.parseInt(input.nextLine());
	 			
	 			//select from entity manager
	 			Professor pro=entitymanager.find(Professor.class, id);
	 					
	 		    entitymanager.remove(pro);
	 			
	 			
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

   
	   //search professor
   public void findEntity() {

 
	   EntityManagerFactory emf=null;
       EntityManager entitymanager=null;
       EntityTransaction transaction=null;
       
       Scanner scanner=new Scanner(System.in);
       
       try {
           emf=Persistence.createEntityManagerFactory("DemoEmpDB");
           entitymanager=emf.createEntityManager();
           
           transaction.begin();
           
           System.out.println("Enter the id: ");
           int id=scanner.nextInt();
           
           Professor pro=entitymanager.find(Professor.class, id);
           pro.toString();
       
         }
       catch(Exception e) {
    	   e.printStackTrace();
       }
       finally {
    	   emf.close();
       }
	   
	   
	}


     //search by name
    public Optional<Professor> findByName(String name) {
	        EntityManagerFactory emf=null;
	        EntityManager entityManager=null;
	        
	        
	        try {
	            emf=Persistence.createEntityManagerFactory("DemoEmpDB");
	            entityManager=emf.createEntityManager();
	            
	        
	            Professor professor=entityManager.createQuery("SELECT p FROM Professor p where p.firstName:name",Professor.class)
	                    .setParameter("name",name)
	                    .getSingleResult();
	            return (Optional<Professor>)(professor!=null?Optional.of(professor):Optional.empty());
	        
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

	   



   

   
