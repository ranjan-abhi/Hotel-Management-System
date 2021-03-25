package com.example.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="room")
@Table(name="room")
public class Room{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="bedsize")
	private String bedSize;
	@Column(name="price")
	private int price;
	@Column(name="roomtype")
	private String roomType;
	@Column(name="facilities")
	private String facilities;
	@Column(name="noofadults")
	int noOfAdults;
	@Column(name="noofrooms") 
	private int noOfRooms;
	@Column(name="bookedrooms")
	private int bookedrooms;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}
	public String getBedSize() {
		return bedSize;
	}
	public void setBedSize(String bedSize) {
		this.bedSize = bedSize;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Room(String bedSize, int price, String roomType, String facilities, int noOfAdults, int noOfRooms) {
		this.bedSize = bedSize;
		this.price = price;
		this.roomType = roomType;
		this.facilities = facilities;
		this.noOfAdults = noOfAdults;
		this.noOfRooms = noOfRooms;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public int getBookedrooms() {
		return bookedrooms;
	}
	public void setBookedrooms(int bookedrooms) {
		this.bookedrooms = bookedrooms;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", bedSize=" + bedSize + ", price=" + price + ", roomType=" + roomType
				+ ", facilities=" + facilities + ", noOfAdults=" + noOfAdults + ", noOfRooms=" + noOfRooms
				+ ", bookedrooms=" + bookedrooms + "]";
	}
	
	
	
	
}