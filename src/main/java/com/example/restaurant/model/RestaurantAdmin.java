package com.example.restaurant.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RESTAURANT_ADMIN")
public class RestaurantAdmin {
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name= "RESTAURANT_ADMIN_ID")
  private int id;
  
  @Column(name= "USERNAME")
  private String username;
  
  @Column(name= "PASSWORD")
  private String password;
  
  @Column(name= "FIRST_NAME")
  private String firstname;
  
  @Column(name= "LAST_NAME")
  private String lastname;
  
  @Column(name= "EMAIL")
  private String email;
  
  @Column(name= "PHONE")
  private int phone;
  
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "RESTAURANT_ID")
  private Restaurant restaurant;

  public Restaurant getRestaurant() {
	return restaurant;
}

public void setRestaurant(Restaurant restaurant) {
	this.restaurant = restaurant;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUsername() {
  return username;
  }

  public void setUsername(String username) {
  this.username = username;
  }

  public String getPassword() {
  return password;
  }

  public void setPassword(String password) {
  this.password = password;
  }

  public String getFirstname() {
  return firstname;
  }

  public void setFirstname(String firstname) {
  this.firstname = firstname;
  }

  public String getLastname() {
  return lastname;
  }

  public void setLastname(String lastname) {
  this.lastname = lastname;
  }

  public String getEmail() {
  return email;
  }

  public void setEmail(String email) {
  this.email = email;
  }


  public int getPhone() {
  return phone;
  }

  public void setPhone(int phone) {
  this.phone = phone;
  }

@Override
public String toString() {
	return "RestaurantAdmin [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phone=" + phone + "]";
	}
	  
	  
}