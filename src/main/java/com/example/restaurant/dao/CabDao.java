package com.example.restaurant.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.restaurant.model.Cab;
import com.example.restaurant.model.Cab;
import com.example.restaurant.util.HibernateUtil;


public class CabDao {
	
	static SessionFactory sessionFactory = null;
	CabAdminDao adao = new CabAdminDao();

	//create Entities or update entity
	public void save(Cab cab) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(cab);
		session.getTransaction().commit();
		session.close();
	}
	
	//Read Entity by id
	public Cab fetchCabById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Cab Cab = (Cab) session.load(Cab.class, id);
		session.close();
		return Cab;
	}
	
	
	//Read Entities
	@SuppressWarnings("unchecked")
	public List<Cab> fetchCabs() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Cab> Cabs = session.createQuery("FROM Cab").list();
		session.close();
		//System.out.println("Check....."+Cabs);
		return Cabs;
	}
	
	
	//delete entity
	public void delete(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();	
		session.beginTransaction();
		Cab c = (Cab) session.load(Cab.class, id);
		session.delete(c);
		session.getTransaction().commit();
		session.close();
	}
	
	/*public Cab checkAvailability() {
		List<Cab> Cabs = fetchCabs();
		for(Cab Cab: Cabs) {
			if(Cab.getStatus().equals("Available")) {
				return Cab;
			}
		}
		return null;
	}*/
	
	/*public Cab bookCab(int id,Request request)	{
		double distanceCovered = 0 , totalPrice = 0;
		Cab Cab= checkAvailability();
		if(Cab != null) {
			Cab.setStatus("Booked");
			totalPrice = distanceCovered * Cab.getCostperKm();
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			BookingDetails bd = new BookingDetails(Cab.getCabId(),id,request.getPickup(),request.getDrop(),distanceCovered,totalPrice,request.getDateandtime());
			session.save(bd);
			session.getTransaction().commit();
			session.close();
		}
		return Cab;
	}*/
	
	//search
	/*@SuppressWarnings("unchecked")
	public List<Cab> search(String keyword)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Cab> result = session.createSQLQuery("Select * from Cab where CabId = keyword").list();
		return result;
	}*/
 
}
