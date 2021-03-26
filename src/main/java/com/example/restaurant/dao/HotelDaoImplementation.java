package com.example.restaurant.dao;

import java.util.List;
import org.hibernate.Session;

import com.example.restaurant.model.Admin;
import com.example.restaurant.model.Hotel;
import com.example.restaurant.util.HibernateUtil;


public class HotelDaoImplementation implements HotelDao{
	
	@Override
	public void insert(Hotel hotel) {
		System.out.println("Creating admin");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(hotel);
		session.getTransaction().commit();
		session.close();
		System.out.println("Employee created successfully" + hotel.toString());
	}

	@Override
	public Hotel getHotel(String username) {
		System.out.println("Retrieving hotel");
		Session session=HibernateUtil.getSessionFactory().openSession();
		Admin admin=session.get(Admin.class, username);
		session.close();
		System.out.println("retrieved successfully"+admin.getHotel().toString());
		return admin.getHotel();
	}

	@Override
	public void update(Hotel hotel,String username) {
		System.out.println("Updating hotel");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Admin admin=session.get(Admin.class, username);
		Hotel a=admin.getHotel();
		a.setName(hotel.getName());
		a.setAddress(hotel.getAddress());
		a.setEmailId(hotel.getEmailId());
		a.setPhNo(hotel.getPhNo());
		a.setStars(hotel.getStars());
		a.setAmenities(hotel.getAmenities());
		a.setRoomService(hotel.getRoomService());
		a.setAvgPrice(hotel.getAvgPrice());
		a.setCabService(hotel.getCabService());
		a.setDescription(hotel.getDescription());
		admin.setHotel(a);
		session.update(admin);
		session.getTransaction().commit();
		session.close();
		System.out.println("hotel updated successfully" + hotel.toString());
	}

	@Override
	public void delete(String name) {
		System.out.println("Deleting hotel entry");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Hotel a=getHotel(name);
		session.delete(a);
		session.getTransaction().commit();
		session.close();
		System.out.println("Hotel deleted successfully ->"+name);
	}

	public List<Hotel> getAll() {
		System.out.println("Fetching employees");
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<Hotel> hotel=session.createQuery("From Hotel").list();
		session.close();
		System.out.println("List fetched successfully");
		return hotel;
	}

}
