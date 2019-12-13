package com.sudeep.hibernate;

import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.TimeZone;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.engine.jdbc.ClobProxy;
import org.hibernate.tuple.ValueGenerator;

public class Application {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) throws SQLException, IOException {
		
//		Historically Hibernate called these components 
//		JPA calls them embeddables
		
		// TODO Auto-generated method stub
		System.out.println("Hibernate application 2 started");

		Session session = sessionFactory.withOptions().jdbcTimeZone(TimeZone.getTimeZone("Europe/Sofia")).openSession();
		session.beginTransaction();
		Publisher publisher = new Publisher();
		publisher.setName("O Reilly");

		Country country = new Country();
		country.setName("India");
		publisher.setCountry(country);
		
		Book book = new Book();
		book.setId(1L);
 		book.setEbookPublisher(publisher);
 		book.setPaperBackPublisher(publisher);
 		
 		book.setTitle("Java Hibrenate");
		book.setAuthor("Sudeep Patel");
		
		session.save(book);

		session.getTransaction().commit();
		session.close();

		session = sessionFactory.openSession();
		session.beginTransaction();
		session.close();
	}

	private static SessionFactory buildSessionFactory() {
		try {
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
			Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
			return metadata.getSessionFactoryBuilder().build();

		} catch (HibernateException he) {
			System.out.println("Session Factory creation failure");
			throw he;
		}
	}

	
	
	
}
