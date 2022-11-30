package com.App.CarBooking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cabdetails")
public class carDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cab_id")
	private int car_id;
	
	@Column(name="cab_name")
	private String carName;
	@Override
	public String toString() {
		return "carDetails [id=" + car_id + ", Your Name =" + carName + "]";
	}
	public carDetails() {
		
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public carDetails(int car_id, String carName) {
		super();
		this.car_id = car_id;
		this.carName = carName;
	}
	

}
