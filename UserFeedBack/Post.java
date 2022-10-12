package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbPost")

public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int postID;
	
	private String postDetails;
	
	@JoinColumn(name="userId")   //User.locationId=Location.locationId
	@ManyToOne
	private User user;
	
	//default Constructor
	public Post() {
		
	}

	//parameterized constructor
	public Post(int postID, String postDetails, User user) {
		super();
		this.postID = postID;
		this.postDetails = postDetails;
		this.user = user;
	}

	//getters and setters
	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public String getPostDetails() {
		return postDetails;
	}

	public void setPostDetails(String postDetails) {
		this.postDetails = postDetails;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	//override
	@Override
	public String toString() {
		return "Post [postID=" + postID + ", postDetails=" + postDetails + ", user=" + user + "]";
	}

	
	
}
