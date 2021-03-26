package com.example.restaurant.dao;

import java.util.List;

import com.example.restaurant.model.Admin;

public interface AdminDao {
	boolean insert(Admin admin);
	Admin getAdmin(String username);
	void update(Admin admin);
	void delete(String username);
	List<Admin> getAll();
}
