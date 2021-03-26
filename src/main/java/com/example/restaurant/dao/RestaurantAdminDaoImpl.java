package com.example.restaurant.dao;

import java.util.List;

import org.hibernate.Session;

import com.example.restaurant.model.Dish;
import com.example.restaurant.model.Login;
import com.example.restaurant.model.Restaurant;
import com.example.restaurant.model.RestaurantAdmin;
import com.example.restaurant.util.HibernateUtil;
import com.mysql.cj.Query;

public class RestaurantAdminDaoImpl implements RestaurantAdminDao{
	
	public static RestaurantAdmin currentAdmin = new RestaurantAdmin();

	@Override
	public int register(RestaurantAdmin restaurantAdmin) {
		System.out.println("Registering Restaurant Admin");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(restaurantAdmin);
		session.getTransaction().commit();
		session.close();
		System.out.println("Restaurant Admin create successfully" +restaurantAdmin.toString());
		setCurrentAdmin(restaurantAdmin);
		return restaurantAdmin.getId();
		
	}

	@Override
	public RestaurantAdmin validateUser(Login login) {
		
		System.out.println("Validating Restaurant Admin");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		RestaurantAdmin restaurantAdmin = (RestaurantAdmin) session.createQuery("from RestaurantAdmin where username=:username and password=:password").setParameter("username", login.getUsername()).setParameter("password", login.getPassword()).uniqueResult();

//		System.out.println("Restaurant Admin validated successfully" +restaurantAdmin.toString());
		return restaurantAdmin;
		
	}

	@Override
	public RestaurantAdmin getCurrentAdmin() {
		
		System.out.println(currentAdmin.getFirstname());
		return currentAdmin;
	}

	@Override
	public void setCurrentAdmin(RestaurantAdmin restaurantAdmin) {
		
		this.currentAdmin = restaurantAdmin;
		System.out.println(currentAdmin.getFirstname());
	}

	@Override
	public void update(RestaurantAdmin restaurantAdmin) {
		
		System.out.println("Updating Restaurant Admin");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(restaurantAdmin);
		session.getTransaction().commit();
		session.close();
		System.out.println("Restaurant Admin updated successfully" +restaurantAdmin.toString());
		setCurrentAdmin(restaurantAdmin);
		
	}

	@Override
	public void delete(RestaurantAdmin restaurantAdmin) {
		

		System.out.println("Deleting Restaurant Admin");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
//		RestaurantDao restaurantDao = new RestaurantDaoImpl();
//		restaurantDao.delete(restaurantAdmin.getRestaurant().getId());
//		session.delete(restaurantAdmin);
		Object persistentInstance = session.load(RestaurantAdmin.class, restaurantAdmin.getId());
		if (persistentInstance != null) {
		    session.delete(persistentInstance);
		}
		session.getTransaction().commit();
		session.close();
		System.out.println("Restaurant deleted successfully" +restaurantAdmin.toString());
		
	}

	@Override
	public void merge(RestaurantAdmin restaurantAdmin) {
		
		System.out.println("Merging Restaurant Admin");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.merge(restaurantAdmin);
		session.getTransaction().commit();
		session.close();
		System.out.println("Restaurant Admin updated successfully" +restaurantAdmin.toString());
		setCurrentAdmin(restaurantAdmin);
	}

}
