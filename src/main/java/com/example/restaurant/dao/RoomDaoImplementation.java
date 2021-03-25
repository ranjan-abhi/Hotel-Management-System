package com.example.restaurant.dao;

import java.util.List;
import org.hibernate.Session;

import com.example.restaurant.model.Admin;
import com.example.restaurant.model.Hotel;
import com.example.restaurant.model.Room;
import com.example.restaurant.util.HibernateUtil;

public class RoomDaoImplementation implements RoomDao {
	int id=0;

	@Override
	public void insert(Room room,String username) {
		System.out.println("inserting room");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Admin admin=session.get(Admin.class, username);
		Hotel a=admin.getHotel();
		a.setName("puru");
		List<Room> l=a.getRooms();
		l.add(room);
		for(Room r:l) {
			System.out.println(r.getRoomType());
		}
		admin.setHotel(a);
		session.update(admin);
		session.getTransaction().commit();
		session.close();
		System.out.println("inserted successfully");
	}

	@Override
	public boolean update(Room room,int id) {
		System.out.println("inserting room");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Room r=session.get(Room.class, id);
		r.setBedSize(room.getBedSize());
		r.setBookedrooms(room.getBookedrooms());
		r.setFacilities(room.getFacilities());
		r.setNoOfAdults(room.getNoOfAdults());
		r.setNoOfRooms(room.getNoOfRooms());
		r.setPrice(room.getPrice());
		r.setRoomType(room.getRoomType());
		session.update(r);
		session.getTransaction().commit();
		session.close();
		System.out.println("inserted successfully");
		return true;
	}

	@Override
	public boolean delete(int id,String username) {
		System.out.println("inserting room");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Admin admin=session.get(Admin.class, username);
		Hotel a=admin.getHotel();
		a.setName("puru");
		List<Room> l=a.getRooms();
		Room room=session.get(Room.class, id);
		l.remove(room);
		for(Room r:l) {
			System.out.println(r.toString());
		}
		a.setRooms(l);
		admin.setHotel(a);
		session.update(admin);
		session.getTransaction().commit();
		session.close();
		System.out.println("inserted successfully");
		return false;
		
	}

	public List<Room> getAll(String username) {
		System.out.println("Fetching room");
		Session session=HibernateUtil.getSessionFactory().openSession();
		Admin admin=session.get(Admin.class, username);
		Hotel a=admin.getHotel();
		List<Room> l=a.getRooms();
		for(Room r:l) {
			System.out.println(r.toString());
		}
		session.close();
		System.out.println("fetch successfull");
		return l;
	}

}
