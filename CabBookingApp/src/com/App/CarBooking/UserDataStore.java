package com.App.CarBooking;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserDataStore {
public static void main(String[] args) {
		
		

		// create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(PassengerDetails.class)
									.buildSessionFactory();
		
	
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// use session object to save Java object
			
			// create student object
			
			System.out.println("Enter the your Details");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Your Name:");
			String pessangerName = s.nextLine();
			System.out.println("Enter the Source to pickup:");
			String source = s.nextLine();
			System.out.println("Enter the Destination to drop:");
			String desti = s.nextLine();
			
			PassengerDetails userDetails = new PassengerDetails(pessangerName,source,desti);
			
		   s.close();
			
			
			// start a transaction
			session.beginTransaction();
			

			// save student object
			System.out.println("Loading the cars You want to choose");
			session.save(userDetails);
			
			// commit transaction
			
			session.getTransaction().commit();
			
			
			
			
			
			
			
			
		} finally {
			factory.close();
		}
				

	}
}
