package com.example.restaurant.util;

import org.hibernate.SessionFactory;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class HibernateUtil {
	
	
	
	private static SessionFactory sessionFactory = null;
	 
	   public static SessionFactory getSessionFactory() 
	   {
	      
	         
	         if (sessionFactory == null) 
	         {
	        	 StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	                     .configure("hibernate/hibernate.cfg.xml")
	                     .build();

	             sessionFactory = new MetadataSources( serviceRegistry )
	                         .buildMetadata()
	                         .buildSessionFactory();
	         }
	         
	         
	         
	         
		   
	         
	         return sessionFactory;
	 
	   

}
	   
}
