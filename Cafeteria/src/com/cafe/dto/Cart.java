package com.cafe.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	//@JoinColumn(name = "itemId")
	@Id
	@GeneratedValue
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "item_id")
	private int itemId;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "cart_price")
	private float cartPrice;
	public Cart() {
		super();
	}
	public Cart(int orderId, int itemId, String itemName, int userId, int quantity, float cartPrice) {
		super();
		this.orderId = orderId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.userId = userId;
		this.quantity = quantity;
		this.cartPrice = cartPrice;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getCartPrice() {
		return cartPrice;
	}
	public void setCartPrice(float cartPrice) {
		this.cartPrice = cartPrice;
	}
	@Override
	public String toString() {
		return "Cart [orderId=" + orderId + ", itemId=" + itemId + ", itemName=" + itemName + ", userId=" + userId
				+ ", quantity=" + quantity + ", cartPrice=" + cartPrice + "]";
	}
	
	
	
	
}
