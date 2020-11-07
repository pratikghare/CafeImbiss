package com.cafe.serv;

import java.util.List;

import com.cafe.dto.Cart;

public interface CartService {
	public void addItem(Cart cart);
	public List<Cart> getItems(int userId);
	public boolean deleteItem(int orderId);
	public boolean deleteUserCart(int userId);
	public boolean updateCart(Cart cart);
	public Cart getCartRecord(int itemId, int userId);
}
