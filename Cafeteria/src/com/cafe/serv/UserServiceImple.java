package com.cafe.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe.dao.UserDao;
import com.cafe.dto.User;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addNewUser(User user) {
		userDao.addUser(user);
	}

	public boolean findUser(User user) {
		return userDao.findUser(user);
	}
	
	public User fetchAccountDetails(int userId) {
		return userDao.findUser(userId);
	}

	@Override
	public void updateUserDetails(User user) {
		System.out.println(user);
		userDao.updateUser(user);
	}

	@Override
	public void deleteUserDetails(User user) {
		userDao.deleteUser(user);		
	}

	@Override
	public String forgotPassword(String userEmail) {
		return userDao.forgotPassword(userEmail);
	}

	@Override
	public boolean updatePassword(int userId, String pass) {
		// TODO Auto-generated method stub
		return userDao.changePassword(userId, pass);
	}
	
	@Override
	public void uploadImage(String profilePic, int userId) {
		userDao.uploadImage(profilePic, userId);
	}
}
