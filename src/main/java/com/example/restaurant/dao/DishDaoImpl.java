package com.example.restaurant.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.Session;

import com.example.restaurant.model.Dish;
import com.example.restaurant.model.Restaurant;
import com.example.restaurant.util.HibernateUtil;

public class DishDaoImpl implements DishDao{
	
//	HashMap<Integer, Dish> hashMap = new HashMap<Integer, Dish>();

	@Override
	public int create(Dish dish) {
		
//		hashMap.put(dish.getId(), dish);
		System.out.println(" Creating Dish");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(dish);
		session.getTransaction().commit();
		session.close();
//		System.out.println("Dish create successfully" +dish.toString());
		return dish.getId();
		
	}

	@Override
	public void update(Dish dish) {
		
//		hashMap.replace(dish.getId(), dish);
		System.out.println("Updating Dish");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(dish);
		session.getTransaction().commit();
		session.close();
//		System.out.println("Dish updated successfully" +dish.toString());
	}

	@Override
	public void delete(int restaurantId, int id) {
		
//		hashMap.remove(id);
		System.out.println("Deleting Dish");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Restaurant restaurant = (Restaurant)session.load(Restaurant.class, restaurantId);
		Dish dish = getDishById(id);
		session.delete(dish);
		restaurant.getDishes().remove(dish);
		session.getTransaction().commit();
		session.close();
//		System.out.println("Restaurant deleted successfully" +dish.toString());
	}

	@Override
	public Dish getDishById(int id) {
		
//		return hashMap.get(id);
		System.out.println("Fetching Dish by id : " + id);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Dish dish = (Dish)session.load(Dish.class, id);
		session.close();
//		System.out.println("Restaurant fetched" +dish.toString());
		return dish;
		
	}

	@Override
	public List<Dish> getDishes() {
		
//		return new ArrayList<Dish>(hashMap.values());
		System.out.println(" Fetching Dishes");
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		List<Dish> dishs = session.createQuery("FROM Dish").list();
		session.close();
//		System.out.println("Fetched " + dishs.size()+ " Dish");
	
		return dishs;
	}
	
	

}
