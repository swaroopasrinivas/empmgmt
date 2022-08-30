package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

	
	@ManyToOne
	@JoinColumn(name = "Id", referencedColumnName = "id", insertable = false, updatable = false)
	private User user;

	@Id
	@Column(name = "OrderId")
	private String orderId;

	@Column(name = "orderDate")
	private String orderDate;

	@Column(name = "orderPrice")
	private String orderPrice;
	
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	/*
	 * public Set<Products> getOrderItems() { return orderItems; }
	 * 
	 * public void setOrderItems(Set<Products> orderItems) { this.orderItems =
	 * orderItems; }
	 */

	/*
	 * @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY, cascade =
	 * CascadeType.ALL) private Set<Products> orderItems;
	 */

}
