package com.sudeep.hibernate.jpa;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
 import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Application {
//	private static final SessionFactory sessionFactory = buildSessionFactory();

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws SQLException, IOException, ParseException {

//		Historically Hibernate called these components 
//		JPA calls them embeddables

		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");

		EntityManager manager = emf.createEntityManager();

		EntityTransaction transaction = null;

		transaction = manager.getTransaction();
		transaction.begin();
		Event event = new Event();
 		
//		java.sql.Date sqlDate = new java.sql.Date(.getTime());
        java.util.Date uDate = new java.util.Date();
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());


 		EventId eid = new EventId();
		eid.setCategory(1);
		UUID uuid = UUID.randomUUID();
		eid.setUuid(uuid);
		eid.setCreatedOn(new Timestamp( System.currentTimeMillis() ) );
		event.setKey("Floor");
		event.setValue("3rd");
		event.setId(eid);
		
		try {
			manager.persist(event);
			transaction.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

		System.out.println("Exceptin handled");
//		List<Account> accounts = manager
//				.createQuery( "select a from TablePerClassAccount a" )
//				.getResultList();		
//		
//		for (Account act: accounts) {
//			System.out.println(act.toString());
//		}
		
		Timestamp currentTimestamp = (Timestamp) manager
				.createNativeQuery(
					"SELECT CURRENT_TIMESTAMP" )
				.getSingleResult();
		
		Event event1 = new Event();

		EventId eid1 = new EventId();
		eid1.setCategory(10);
		eid1.setCreatedOn(currentTimestamp );
		event1.setKey("Floor");
		event1.setValue("3rd");
		event1.setId(eid1);
		
		eid1.setUuid( UUID.randomUUID());

		try {
			transaction.begin();

			manager.persist(event1);
			transaction.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

		System.out.println("Exceptin handled");

//		
	}

}
