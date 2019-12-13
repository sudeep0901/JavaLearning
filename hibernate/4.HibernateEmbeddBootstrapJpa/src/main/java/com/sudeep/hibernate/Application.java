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
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.engine.jdbc.ClobProxy;
import org.hibernate.tuple.ValueGenerator;

import net.bytebuddy.implementation.Implementation;

public class Application {
//	private static final SessionFactory sessionFactory = buildSessionFactory();

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) throws SQLException, IOException {

//		Historically Hibernate called these components 
//		JPA calls them embeddables

		// TODO Auto-generated method stub
		System.out.println("Hibernate application 2 started");

		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
				.configure("/com/sudeep/hibernate/hibernate.cfg.xml").build();
		
		Metadata metadata = new MetadataSources(standardRegistry)
				.addAnnotatedClass(Customer.class)
				.addAnnotatedClassName("com.sudeep.hibernate.Customer")
				.addResource("com/sudeep/hibernate/Customer.hbm.xml")
				.getMetadataBuilder()
				.applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
				.build();
		
		SessionFactoryBuilder sessionFactoryBuilder = metadata.getSessionFactoryBuilder();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder()
 			    .build();
	}

}
