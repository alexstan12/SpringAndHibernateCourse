package com.alexspring.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alexspring.hibernate.demo.entity.Instructor;
import com.alexspring.hibernate.demo.entity.InstructorDetail;
import com.alexspring.hibernate.demo.entity.Student;

public class GetInstructorDetailDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration ()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		// create session
		
		Session session = factory.getCurrentSession();
		
		try {
			
			

			
			//start a transaction
			session.beginTransaction();

			// get instructor detail object
			int theId = 2999;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			
			// print the instructor detail
			System.out.println("Found instructor detail: " + tempInstructorDetail);
			
			if(tempInstructorDetail !=null) {				
	
				Instructor tempInstructor = tempInstructorDetail.getInstructor();
				
				// print the associated instructor
				System.out.println("The associated instructor: " + tempInstructor);
			}
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		finally {
			// handle connection leak issue
			session.close();
			factory.close();
		}
	}

}
