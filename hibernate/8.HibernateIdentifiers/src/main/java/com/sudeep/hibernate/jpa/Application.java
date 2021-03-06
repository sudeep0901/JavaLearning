package com.sudeep.hibernate.jpa;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Application {
//	private static final SessionFactory sessionFactory = buildSessionFactory();

	public static void main(String[] args) throws SQLException, IOException {

//		Historically Hibernate called these components 
//		JPA calls them embeddables

		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");

		EntityManager manager = emf.createEntityManager();

		EntityTransaction transaction = null;

				transaction = manager.getTransaction();
		transaction.begin();
		SystemUser sysUser = new SystemUser();
		
		sysUser.setAuthor("Sudeep");
		sysUser.setId(1);
 		sysUser.setTitle("Title of system");
 		Subsystem subsystem = new Subsystem();
 		
 		subsystem.setDescription("Subsystem Description");
 		subsystem.setId(1);
 		PK pk = new PK(subsystem, "Subsystem Description");
 		
 		sysUser.setPk(pk);
 		
 		try {
 			manager.persist(sysUser);
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
//		
	}

}
