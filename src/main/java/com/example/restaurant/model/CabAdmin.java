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
@Table(name = "CAB_ADMIN")
public class CabAdmin {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RECORD_ID")
	int id;
	@Column(name = "FIRST_NAME")
	String firstname;
	@Column(name = "LAST_NAME")
	String lastname;
	@Column(name = "MAIL_ID")
    String mailId;
	@Column(name = "USERNAME")
	@Id
	String username;
	@Column(name = "PASSWORD")
	String password;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	List<Cab> cabs = new ArrayList<Cab>();
	
	public CabAdmin() {
		
	}
	public CabAdmin(int id, String firstname, String lastname, String mailId, String username, String password) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mailId = mailId;
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
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
	public List<Cab> getCabs() {
		return cabs;
	}
	public void setCabs(List<Cab> cabs) {
		this.cabs = cabs;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", mailId=" + mailId
				+ ", username=" + username + ", password=" + password+ ", Cabs=" +cabs+"]";
	}
}
