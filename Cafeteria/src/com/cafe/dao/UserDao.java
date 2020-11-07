package com.cafe.dao;

import com.cafe.dto.User;

public interface UserDao {
	public void addUser(User user);
	public boolean findUser(User user);
	public User findUser(int userId);
	public void updateUser(User user);
	public void deleteUser(User user);
	public String forgotPassword(String userEmail);
	public boolean changePassword(int userId, String pass);
	void uploadImage(String profilePic, int userId);
}
