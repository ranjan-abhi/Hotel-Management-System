package com.example.restaurant.dao;

import com.example.restaurant.model.Hotel;

public interface HotelDao {
	
		void insert(Hotel hotel);
		Hotel getHotel(String name);
		void update(Hotel hotel, String string);
		void delete(String name);		
}
