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
		Person person = new Person();
		
		person.setName("Sudeep Patel");
		manager.persist(person);
		for(int i=0;i<10;i++) {
		Phone phone = new Phone();
		phone.setNumber("8828132303" + i);
		phone.setPerson(person);
		manager.persist(phone);
		}
		
		
		transaction.commit();
		System.out.println("Exceptin handled");

//		
	}

}
