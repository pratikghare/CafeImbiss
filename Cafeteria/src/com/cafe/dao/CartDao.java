package com.cafe.dao;

import java.util.List;

import com.cafe.dto.Cart;

public interface CartDao {
	public List<Cart> selectAll(int userId);
	public void insertItem(Cart cart);
	public boolean deleteRecord(int orderId);
	public boolean deleteUserRecords(int userId);
	public boolean updateCart(Cart cart);
	public Cart getRecord(int itemId, int userId);
}
