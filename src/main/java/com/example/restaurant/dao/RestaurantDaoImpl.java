package com.example.restaurant.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.example.restaurant.model.Dish;
import com.example.restaurant.model.Restaurant;
import com.example.restaurant.util.*;



public class RestaurantDaoImpl implements RestaurantDao{
	
//	HashMap<Integer, Restaurant> hashMap = new HashMap<Integer, Restaurant>();
	
	@Override
	public int create(Restaurant restaurant) {
		
//		hashMap.put(restaurant.getId(), restaurant);
		System.out.println(" Creating Restaurant");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(restaurant);
		session.getTransaction().commit();
		session.close();
		System.out.println("Restaurant create successfully" +restaurant.toString());
		return restaurant.getId();
	}

	@Override
	public void update(Restaurant restaurant) {
	
//		hashMap.replace(restaurant.getId(), restaurant);

		System.out.println("Updating Restaurant");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(restaurant);
		session.getTransaction().commit();
		session.close();
		System.out.println("Restaurant updated successfully" +restaurant.toString());
	}

	@Override
	public void delete(int id) {
		
//		hashMap.remove(id);

		System.out.println("Deleting Restaurant");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
//		Restaurant restaurant = getRestaurantById(id);
//		Object persistentInstance = session.load(Restaurant.class, id);
//		if (persistentInstance != null) {
//		    session.delete(persistentInstance);
//		}
//		session.delete(restaurant);
		session.getTransaction().commit();
		session.close();
//		System.out.println("Restaurant deleted successfully" +restaurant.toString());
	}

	@Override
	public Restaurant getRestaurantById(int id) {
		

		System.out.println("Fetching Restaurant by id : " + id);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Restaurant restaurant = (Restaurant)session.load(Restaurant.class, id);
		session.close();
		System.out.println("Restaurant fetched" +restaurant.toString());
		return restaurant;
	}

	@Override
	public List<Dish> getDishesFromRestaurant(int id) {
		

		System.out.println("Fething dishes");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Restaurant restaurant = (Restaurant)session.load(Restaurant.class, id);
		session.close();
		
		return restaurant.getDishes();
	}

}
