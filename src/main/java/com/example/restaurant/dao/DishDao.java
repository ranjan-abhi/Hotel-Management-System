package com.example.restaurant.dao;

import java.util.List;

import com.example.restaurant.model.Dish;

public interface DishDao {
	
	public int create(Dish dish);
	public void update(Dish dish);
	public Dish getDishById(int id);
	public List<Dish> getDishes();
	void delete(int restaurantId, int id);
}
