package com.cafe.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe.dao.CartDao;
import com.cafe.dto.Cart;

@Service
public class CartServiceImple implements CartService {

	@Autowired
	CartDao cartDao;
	

	@Override
	public void addItem(Cart cart) {
		// TODO Auto-generated method stub
		cartDao.insertItem(cart);
	}


	@Override
	public List<Cart> getItems(int userId) {
		return cartDao.selectAll(userId);
	}


	@Override
	public boolean deleteItem(int orderId) {
		return cartDao.deleteRecord(orderId);
	}


	@Override
	public boolean deleteUserCart(int userId) {
		// TODO Auto-generated method stub
		return cartDao.deleteUserRecords(userId);
	}


	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartDao.updateCart(cart);
	}


	@Override
	public Cart getCartRecord(int itemId, int userId) {
		// TODO Auto-generated method stub
		return cartDao.getRecord(itemId, userId);
	}


}
