package com.example.restaurant.dao;

import java.util.List;

import com.example.restaurant.model.Dish;
import com.example.restaurant.model.Restaurant;

public interface RestaurantDao {
	
	public int create(Restaurant restaurant);
	public void update(Restaurant restaurant);
	public void delete(int id);
	public Restaurant getRestaurantById(int id);
	public List<Dish> getDishesFromRestaurant(int id);
}
