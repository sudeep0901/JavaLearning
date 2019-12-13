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

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) throws SQLException, IOException {

//		Historically Hibernate called these components 
//		JPA calls them embeddables

		// TODO Auto-generated method stub
 		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
 		
 		EntityManager manager = emf.createEntityManager();
 		
 		EntityTransaction transaction = null;
 		
 		transaction = manager.getTransaction();
 		transaction.begin();
 		Customer customer = new Customer();
 		
// 		customer.setId(1011);
 		customer.setName("sudeep Patel");
 		
	Customer customer1 = new Customer();
 		
// 		customer.setId(1011);
 		customer1.setName("sudeep Patel");
Customer customer2 = new Customer();
 		
// 		customer.setId(1011);
 		customer2.setName("sudeep Patel");
 		manager.persist(customer);
 		manager.persist(customer1);
 		manager.persist(customer2);
 		transaction.commit();
 
        transaction.begin();
        List<Customer> customers = null;

         customers=   manager.createQuery("SELECT s FROM Customer s", Customer.class).getResultList();
        transaction.commit();
        
        for (Customer cust: customers) {
        	System.out.println(cust.toString());
        }
        Session session = manager.unwrap( Session.class );

        List<Customer> custs = session.byMultipleIds(Customer.class)
        		.multiLoad(17, 18, 19);
        
        System.out.println(custs.size());
        
        SessionFactory sessionFactory = emf.unwrap( SessionFactory.class );
        Statistics statistics = sessionFactory.getStatistics();
        statistics.clear();
        
        
        sessionFactory.getCache().evictAll();
        statistics.clear();
 
        

        List<Customer> custs2 = session.
        		byMultipleIds(Customer.class)
//        		.enableSessionCheck(true)
        		.multiLoad(17, 18, 19);
        
        System.out.println(custs2.size());
//        transaction.begin();
//
//        // Get the Student object
//        Customer custUpdate = manager.find(Customer.class, 2);
//        custUpdate.setName("manasvi Patel");
//        manager.persist(custUpdate);
//        transaction.commit();	
        System.out.println(statistics.getQueryExecutionCount());
        System.out.println(statistics.getSecondLevelCacheHitCount());
        System.out.println(statistics.getSecondLevelCachePutCount());
        

        List<Customer> custs3 = session.
        		byMultipleIds(Customer.class)
        		.enableSessionCheck(true)
        		.with( CacheMode.NORMAL )
        		.multiLoad(17, 18, 19);
        
        System.out.println(custs3.size());
//        transaction.begin();
//
//        // Get the Student object
//        Customer custUpdate = manager.find(Customer.class, 2);
//        custUpdate.setName("manasvi Patel");
//        manager.persist(custUpdate);
//        transaction.commit();	
        System.out.println("second leve:" + statistics.getQueryExecutionCount());
        System.out.println(statistics.getSecondLevelCacheHitCount());
        System.out.println(statistics.getSecondLevelCachePutCount());
 	}
	
	
	
}
 