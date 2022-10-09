package com.Question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		EmployeeClassMethod ecm=new ImplementAllMEthod();
		Scanner input=new Scanner(System.in);
		System.out.println("want to save emp data Enter 1");
		System.out.println("want to see student address Enter 2");
		System.out.println("want to gave bonus to employee Enter 3");
		System.out.println("want to remove employee Enter 4");
		int sc=input.nextInt();
	
		
		switch(sc) {
		case 1:
			
			 System.out.println("Enter enmpid");
		     int empid=input.nextInt();
		     
		     System.out.println("enter emp name");
		     String name=input.next();
		     
		     System.out.println("Enter emp address");
		     String address=input.next();
		     
		     System.out.println("Enter the salary");
		     int salary=input.nextInt();
		     
		     Employee employee=new Employee(empid, name, address, salary);
			
			
			ecm.save(employee);
			break;
			
		case 2:
			System.out.println("Enter empid");
			int empid1=input.nextInt();
			
			String addres=ecm.getAddressOfEmployee(empid1);
			System.out.println(addres);
			break;
		case 3:
			System.out.println("Enter empId");
			int Eid=input.nextInt();
			System.out.println("Enter bonus");
			int bonus=input.nextInt();
			String result=ecm.giveBonusToEmployee(Eid, bonus);
			System.out.println(result);
			break;
		case 4:
			System.out.println("Enter Empid");
			int Empid=input.nextInt();
			boolean re=ecm.deleteEmployee(Empid);
			System.out.println(re);
			break;
			default:
				System.out.println("no any operation performed");
		}
		

	}

}
