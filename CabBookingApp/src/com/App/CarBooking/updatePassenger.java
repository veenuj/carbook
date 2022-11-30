package com.App.CarBooking;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class updatePassenger {
	
	
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

			//use session object to save Java object

			int pas_id = 1;

			// start a transaction
			session.beginTransaction();

			PassengerDetails upQ = session.get(PassengerDetails.class, pas_id);

			System.out.println(upQ);


			// updating object

			System.out.println("updating passenger");

			upQ.setPessangerName("Dutt");





			// commit transaction

			session.getTransaction().commit();



			




			System.out.println("DONE !!!!!");


		} finally {
			factory.close();
		}


	}

}



