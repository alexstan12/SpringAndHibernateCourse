package com.alexspring.hibernate.homework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alexspring.hibernate.homework.entity.Employee;

public class MainEmployeeHomework {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Creating a new employee object .");
			Employee tempEmployee = new Employee("Alex", "Stan", "Endava");
			session.beginTransaction();
			
			// saving the employee
			System.out.println("Saving the employee : " + tempEmployee);
			session.save(tempEmployee);
					
			session.getTransaction().commit();
			
			// starting a new session
			session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			// get object by primary key
			System.out.println("Retrieving object by primary key");
			Employee myEmployee = session.get(Employee.class, tempEmployee.getId());
			System.out.println("Employee with id " + tempEmployee.getId() + " = " + myEmployee);
			
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}
	}

}
