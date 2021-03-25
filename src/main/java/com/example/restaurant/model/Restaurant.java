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

@Entity
@Table(name="RESTAURANTS")
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "RESTAURANT_ID")
	private int id;
	
	@Column(name= "NAME")
	private String name;
	
	@Column(name= "NO_OF_DISH")
	private int noOfDish;
	
	@Column(name= "RATING")
	private int rating;
	
	@Column(name= "ADDRESS")
	private String address;
	
	@Column(name= "MOBILE")
	private int mobile;
	
	@Column(name= "About")
	private String about;
	
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Dish> dishes = new ArrayList<>();
	
	
	public List<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
	public int getId() {
		return id;
	}
	public String getAddress() {
		return address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfDish() {
		return noOfDish;
	}
	public void setNoOfDish(int noOfDish) {
		this.noOfDish = noOfDish;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", noOfDish=" + noOfDish + ", rating=" + rating
				+ ", address=" + address + ", mobile=" + mobile + ", dishes=" + dishes + "]";
	}
	
	
	
}
