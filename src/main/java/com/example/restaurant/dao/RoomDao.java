package com.example.restaurant.dao;

import java.util.List;

import com.example.restaurant.model.Room;

public interface RoomDao {
	void insert(Room room,String username);
	boolean update(Room room,int id);
	boolean delete(int id,String username);
	public List<Room> getAll(String username);
}


