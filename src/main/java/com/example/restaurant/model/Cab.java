package com.example.restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CABS")
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
	int cabId;
    @Column(name = "CAB_TYPE")
    String cabType;
    @Column(name = "LOCATION")
	String location;
    @Column(name = "DRIVER_NAME")
    String driverName;
    @Column(name = "VEHICLE_NO")
    String vehicleNo;
    String status="Available";
    @Column(name = "Cost_PER_KM")
	int costperKm;

	public Cab()
	{
		
	}
	public Cab(int cabId, String cabType, String location, String driverName, String vehicleNo, int costperKm) {
		this.cabId = cabId;
		this.cabType = cabType;
		this.location = location;
		this.driverName = driverName;
		this.vehicleNo = vehicleNo;
		this.costperKm = costperKm;
	}
	
	
	public int getCabId() {
		return cabId;
	}
	public void setCabId(int cabId) {
		this.cabId = cabId;
	}
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public int getCostperKm() {
		return costperKm;
	}
	public void setCostperKm(int costperKm) {
		this.costperKm = costperKm;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return (cabId+"\t"+ cabType+"\t"+location+"\t"+driverName+"\t"+vehicleNo+"\t"+costperKm+"\t"+status);
	}
	

}
