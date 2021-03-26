package com.example.restaurant.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="hotel")
@Table(name="hotel")
public class Hotel {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="emailid")
	private String emailId;
	@Column(name="phno")
	private String phNo;
	@Column(name="stars")
	private int stars;
	@Column(name="amenities")
	private String amenities;
	@Column(name="cabservice")
	private String cabService;
	@Column(name="roomservice")
	private String roomService;
	@Column(name="description")
	private String description;
	@Column(name="avgPrice")
	private int avgPrice;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true,fetch=FetchType.EAGER)
	private List<Room> rooms=new ArrayList<>();
	
	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	public String getAddress() {
		return address;
	}

	public String getAmenities() {
		return amenities;
	}

	public int getAvgPrice() {
		return avgPrice;
	}

	public String getCabService() {
		return cabService;
	}

	public String getDescription() {
		return description;
	}

	public String getEmailId() {
		return emailId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhNo() {
		return phNo;
	}

	public String getRoomService() {
		return roomService;
	}

	public int getStars() {
		return stars;
	}

	public String isRoomService() {
		return roomService;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public void setAvgPrice(int avgPrice) {
		this.avgPrice = avgPrice;
	}

	public void setCabService(String cabService) {
		this.cabService = cabService;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public void setRoomService(String roomService) {
		this.roomService = roomService;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", address=" + address + ", emailId=" + emailId + ", phNo=" + phNo
				+ ", stars=" + stars + ", amenities=" + amenities + ", cabService="
				+ cabService + ", roomService=" + roomService + ", description=" + description + ", avgPrice="
				+ avgPrice + "]";
	}	
	
}
