package com.alexspring.hibernate.homework;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alexspring.hibernate.homework.entity.Employee;

public class QueryEmployeeHomework {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory(); 
		
		Session session = factory.getCurrentSession();
		try {
			
			Employee e1 = new Employee("Gicu", "Stanciu", "IBM");
			Employee e2 = new Employee("Nelu", "Ploaie", "Endava");
			Employee e3 = new Employee("Tanta", "Sufrina", "IBM");
			Employee e4 = new Employee("Cati", "Juganaru", "Vodafone");
			
			session.beginTransaction();
			
			// adding employees to the db
			session.save(e1);
			session.save(e2);
			session.save(e3);
			session.save(e4);
			
			session.getTransaction().commit();
			
			// starting new session to query
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			List<Employee> employees = session.createQuery("from Employee e where e.company = 'IBM'")
					.getResultList();
			
			displayEmployees(employees);
			
			session.getTransaction().commit();
			
			// deleting an object by primary key
			
			session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			Employee tempEmployee = session.get(Employee.class, 3);
			
			System.out.println("Employee to delete: " + tempEmployee);
			
			session.delete(tempEmployee);
			
			employees = session.createQuery("from Employee").getResultList();
			
			displayEmployees(employees);
			
			session.getTransaction().commit();
			
			
			
		}finally {
			factory.close();
		}
	}

	private static void displayEmployees(List<Employee> employees) {
		for(Employee e : employees) {
			System.out.println(e);
		}
	}

}
