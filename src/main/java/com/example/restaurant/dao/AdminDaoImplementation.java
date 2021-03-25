package com.example.restaurant.dao;

import java.util.List;
import org.hibernate.Session;

import com.example.restaurant.model.Admin;
import com.example.restaurant.util.HibernateUtil;


public class AdminDaoImplementation implements AdminDao {
	
	
	@Override
	public boolean insert(Admin admin) {
		System.out.println("Creating admin");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Admin a=session.get(Admin.class, admin.getUsername());
		if(a!=null)
				return false;
		session.save(admin.getHotel());
		session.save(admin);
		session.getTransaction().commit();
		session.close();
		System.out.println("Admin created successfully" + admin.toString());
		return true;
	}

	@Override
	public Admin getAdmin(String username) {
		System.out.println("Retrieving Admin"+username);
		Session session=HibernateUtil.getSessionFactory().openSession();
		Admin admin=session.get(Admin.class, username);
		session.close();
		System.out.println("retrieved successfully"+admin.toString());
		return admin;
	}

	@Override
	public void update(Admin admin) {
		System.out.println("Updating admin"+admin.getUsername());
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Admin a=session.get(Admin.class, admin.getUsername());
		System.out.println(a.toString());
		a.setEmailId(admin.getEmailId());
		a.setGender(admin.getGender());
		a.setName(admin.getName());
		a.setPassword(admin.getPassword());
		a.setPhNo(admin.getPhNo());
		session.getTransaction().commit();
		session.close();
		System.out.println("Employee updated successfully" + admin.toString());
	}

	@Override
	public void delete(String username) {
		System.out.println("Deleting admin entry");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Admin a=getAdmin(username);
		session.delete(a);
		session.getTransaction().commit();
		session.close();
		System.out.println("Employee deleted successfully ->"+username);
	}
	
	@Override
	public List<Admin> getAll() {
		System.out.println("Fetching employees");
		Session session=HibernateUtil.getSessionFactory().openSession();
		 List<Admin> admin=session.createQuery("From admin").list();
		session.close();
		System.out.println("List fetched successfully");
		return admin;
	}

	public boolean auth(String username, String password) {
		System.out.println("Creating admin");
		Session session=HibernateUtil.getSessionFactory().openSession();
		Admin a=session.get(Admin.class, username);		
		
		if(a.getPassword().equals(password) && a!=null)
			return true;
		session.close();
		System.out.println("Admin found successfully");
		return false;
	}
	
	
}
