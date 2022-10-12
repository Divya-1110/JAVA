package com.nissan.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tbLocation")

public class Location {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int LocationId;
	
	private String locationName;
	
	@JsonIgnore      //Avoid recursive
	@OneToMany(mappedBy="location")
	private List<User> users;
	
	//default constructor
	public Location() {
		
	}

	//parameterized constructor
	public Location(int locationId, String locationName, List<User> users) {
		super();
		LocationId = locationId;
		this.locationName = locationName;
		this.users = users;
	}

	//getters and setters
	public int getLocationId() {
		return LocationId;
	}

	public void setLocationId(int locationId) {
		LocationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	//override
	@Override
	public String toString() {
		return "Location [LocationId=" + LocationId + ", locationName=" + locationName + ", users=" + users + "]";
	}

	
}
