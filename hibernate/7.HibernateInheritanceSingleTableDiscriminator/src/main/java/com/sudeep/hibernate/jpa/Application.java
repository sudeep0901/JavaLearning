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

		DebitAccount db = new DebitAccount();
		db.setBalance(200.00);
		db.setInterestRate(8.0);
		db.setOverdraftFee(200);
		db.setOwner("Sudeep Patel");
		db.setDebitKey("Debit");
		CreditAccount cb = new CreditAccount();
		cb.setBalance(200.00);
		cb.setInterestRate(8.0);
		cb.setCreditLimit(200);
		cb.setOwner("Sudeep Patel");
		cb.setCreditKey("Credit");
		OtherAccount oa = new OtherAccount();
		oa.setBalance(200.00);
		oa.setInterestRate(8.0);
		oa.setOwner("Sudeep Patel");

		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(db);
		manager.persist(cb);
		manager.persist(oa);

		transaction.commit();

		transaction.begin();

		List<Account> accounts = manager
				.createQuery( "select a from JoinedAccountJoined a" )
				.getResultList();		
		
		for (Account act: accounts) {
			System.out.println(act.toString());
		}
		
	}

}
