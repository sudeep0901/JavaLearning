package com.sudeep.hibernate.jpa;

import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.CacheMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.engine.jdbc.ClobProxy;
import org.hibernate.stat.Statistics;
import org.hibernate.tuple.ValueGenerator;

import net.bytebuddy.implementation.Implementation;

public class Application {
//	private static final SessionFactory sessionFactory = buildSessionFactory();

	public static void main(String[] args) throws SQLException, IOException {

//		Historically Hibernate called these components 
//		JPA calls them embeddables

		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");

		EntityManager manager = emf.createEntityManager();

		EntityTransaction transaction = null;

		DebitAccount db = new DebitAccount();
		db.setBalance(200.00);
		db.setInterestRate(8.0);
		db.setOverdraftFee(200);
		db.setOwner("Sudeep Patel");

		CreditAccount cb = new CreditAccount();
		cb.setBalance(200.00);
		cb.setInterestRate(8.0);
		cb.setCreditLimit(200);
		cb.setOwner("Sudeep Patel");

		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(db);
		manager.persist(cb);
		transaction.commit();

	}

}
