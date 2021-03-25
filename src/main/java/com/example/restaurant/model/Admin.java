package com.example.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="admin")
@Table(name="admin")
public class Admin {

	@Column(name="name")
	String name;
	@Column(name="gender")
	String gender;
	@Column(name="emailid")
	String emailId;	
	@Id
	@Column(name="username")
	String username;
	@Column(name="password")
	String password;
	@Column(name="phno")
	String phNo;
	
	@OneToOne
	@JoinColumn(name="hotel_id")
	private Hotel hotel;
	
	public Admin() {
	}

	public Admin(String name, String gender, String emailId, String username, String password, String phNo) {
		
		this.name = name;
		this.gender = gender;
		this.emailId = emailId;
		this.username = username;
		this.password = password;
		this.phNo = phNo;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", gender=" + gender + ", emailId=" + emailId + ", username=" + username
				+ ", password=" + password + ", phNo=" + phNo + "]";
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
		
		
}
