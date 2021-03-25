package com.example.restaurant.service;

import java.util.List;

import org.hibernate.Session;

import com.example.restaurant.model.Homepage;
import com.example.restaurant.model.Restaurant;
import com.example.restaurant.model.RestaurantAdmin;
import com.example.restaurant.util.HibernateUtil;

public class HomepageServiceImpl implements HomepageService{

	@Override
	public List<Object> getQueryResult(Homepage homepage) {
		
		System.out.println("Fetching Search Query Result");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Object> queryResult =  session.createQuery("from Restaurant where name=:name or address=:name").setParameter("name", homepage.getQuery()).list();
		List<Object> dishList =  session.createQuery("from Dish where name=:name").setParameter("name", homepage.getQuery()).list();
		queryResult.addAll(dishList);
		
		session.close();
		System.out.println("Query Result" + homepage.toString());
		return queryResult;
	}

}
