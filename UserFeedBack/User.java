package com.nissan.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tbUser")


public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	//@Column(name="userName",length=10)
	private String userName;
	private int  locationId;
	
	@JoinColumn(name="locationId",insertable=false,updatable=false)   //User.locationId=Location.locationId
	@ManyToOne
	private Location location;
	
	@JsonIgnore      //Avoid recursive
	@OneToMany(mappedBy="user")
	private List<Post> posts;
	private boolean isActive;
	
	//default constructor
	public User() {
		
	}

	//parameterized constructor
	public User(int userId, String userName,int locationId, Location location, List<Post> posts,boolean isActive) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.locationId=locationId;
		this.location = location;
		this.posts = posts;
		this.isActive=isActive;
	}

	//getters and setters
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
    //location
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	//posts
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
   //locationId
	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	//override
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", locationId=" + locationId + ", location="
				+ location + ", posts=" + posts + ", isActive=" + isActive + "]";
	}

	}

	
	
	


