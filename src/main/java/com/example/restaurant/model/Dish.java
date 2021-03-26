package com.example.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.InitBinder;

@Entity
@Table(name="DISH")
public class Dish {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "DISH_ID")
	private int id;
	
	@Column(name= "NAME")
	private String name;
	
	@Column(name= "RATING")
	private int rating;
	
	@Column(name= "DESCRIPTION")
	private String description;
	
	@Column(name= "PRICE")
	private int price;
	
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
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
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", rating=" + rating + ", description=" + description + "]";
	}
	
	

}
