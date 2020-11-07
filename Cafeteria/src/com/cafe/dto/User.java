package com.cafe.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_email", unique = true)
	private String userEmail;
	@Column(name = "user_pass")
	private String userPass;
	@Column(name = "user_phone")
	private String userPhone;
	@Column(name = "user_city")
	private String userCity;
	@Column(name = "profile_pic")
	private String profilePic;
	
	public User() {
		super();
	}

	public User(int userId, String userName, String userEmail, String userPass, String userPhone, String userCity,
			String profilePic) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPass = userPass;
		this.userPhone = userPhone;
		this.userCity = userCity;
		this.profilePic = profilePic;
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPass="
				+ userPass + ", userPhone=" + userPhone + ", userCity=" + userCity + ", profilePic=" + profilePic + "]";
	}

	
	
}
