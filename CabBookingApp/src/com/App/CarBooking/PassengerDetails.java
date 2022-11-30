package com.App.CarBooking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passengerName")

public class PassengerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="p_id")
	private int id;
	
	@Column(name="pessanger_name")
	private String pessangerName;
	
	@Override
	public String toString() {
		return "PassengerDetails [id=" + id + ", Your Name =" + pessangerName + ", Source=" + source + ", Destination=" + desti + "]";
	}
	@Column(name="source")
	private String source;
	
	
	@Column(name="destination")
	private String desti;
	
	public PassengerDetails() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPessangerName() {
		return pessangerName;
	}

	public void setPessangerName(String pessangerName) {
		this.pessangerName = pessangerName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDesti() {
		return desti;
	}

	public void setDesti(String desti) {
		this.desti = desti;
	}

	public PassengerDetails( String pessangerName, String source, String desti) {
		super();
		
		this.pessangerName = pessangerName;
		this.source = source;
		this.desti = desti;
	}
	
}

