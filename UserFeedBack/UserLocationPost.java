package com.nissan.dto;

public class UserLocationPost {
	
	private int userId;
	private String userName;
	private  String locationName;
	private String PostDetails;
	
	public UserLocationPost() {
		
	}

	public UserLocationPost(int userId, String userName, String locationName, String postDetails) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.locationName = locationName;
		PostDetails = postDetails;
	}

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

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getPostDetails() {
		return PostDetails;
	}

	public void setPostDetails(String postDetails) {
		PostDetails = postDetails;
	}

	@Override
	public String toString() {
		return "UserLocationPost [userId=" + userId + ", userName=" + userName + ", locationName=" + locationName
				+ ", PostDetails=" + PostDetails + "]";
	}

	
}
