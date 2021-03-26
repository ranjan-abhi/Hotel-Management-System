package com.example.restaurant.dao;

import com.example.restaurant.model.Login;
import com.example.restaurant.model.RestaurantAdmin;

public interface RestaurantAdminDao {

  int register(RestaurantAdmin restaurantAdmin);
  void update(RestaurantAdmin restaurantAdmin);
  void merge(RestaurantAdmin restaurantAdmin);
  RestaurantAdmin validateUser(Login login);
  RestaurantAdmin getCurrentAdmin();
  void setCurrentAdmin(RestaurantAdmin restaurantAdmin);
  void delete(RestaurantAdmin restaurantAdmin);
  
}