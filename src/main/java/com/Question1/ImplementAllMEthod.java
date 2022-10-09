package com.Question1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ImplementAllMEthod implements EmployeeClassMethod{
 EntityManagerFactory emf=	Persistence.createEntityManagerFactory("empUnit");
 
 EntityManager em= emf.createEntityManager();
 
 Scanner input=new Scanner(System.in);
 
	
        
	@Override
	public void save(Employee emp) {
      
    em.getTransaction().begin();
     em.persist(emp);
     em.getTransaction().commit();
     em.close();
     System.out.println("employe data inserted ");
     System.out.println("done");
      
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		String address=null;
		   Employee employee=em.find(Employee.class, empId);
		       if(employee==null)
		    	   address="student no found";
		       else
		    	   address=employee.getAddress();
		   
		   
		return address;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		  String bonu=null;
		  Employee employee=em.find(Employee.class,empId);
		  if(employee==null)
			  bonu="student not fpound";
		  else {
			    em.getTransaction().begin();
			    employee.setSalary(employee.getSalary()+bonus);
			    em.getTransaction().commit();
			    em.close();
			  bonu="Employee have got bonus of "+bonus;
		  }
		  
		return bonu;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		Employee emp=em.find(Employee.class,empId);
		if(emp==null) {
			System.out.println("no Student foud");
			return false;
		}
		else {
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
			em.close();
			return true;
		}
		
	}

}
