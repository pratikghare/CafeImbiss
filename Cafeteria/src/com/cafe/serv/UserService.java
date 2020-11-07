package com.cafe.serv;

import com.cafe.dto.User;


public interface UserService {
	public void addNewUser(User user);
	public User fetchAccountDetails(int userId);
	public void updateUserDetails(User user);
	public void deleteUserDetails(User user);
	public String forgotPassword(String userEmail);
	public boolean updatePassword(int userId, String pass);
	public void uploadImage(String profilePic, int userId);
}
