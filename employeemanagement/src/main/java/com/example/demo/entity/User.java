package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity
	@Table(name = "userss")
	public class User {
		
		private long id;
		private String emailid;
		private String userName;
		private3 String password
		
		
//		@Id
//		@GeneratedValue(strategy = GenerationType.IDENTITY)
//		private String id;
//		
//		@Column(name = "emailId")
//		private String emailId;
//		
//		@Column(name = "userName")	
//		private String userName;
//		
//		@Column(name = "password")
//		private String password;
//		
//		 @OneToMany(targetEntity=Orders.class, mappedBy = "user", fetch = FetchType.LAZY,
//		            cascade = CascadeType.ALL)
//		// @JoinColumn(name = "Id", referencedColumnName = "Id", insertable = false, updatable = false)
//		    private List<Orders> orders; //= new ArrayList<Orders>();
//		 
//		 
//		/*public List<Orders> getOrders() {
//			return orders;
//		}
//		public void setOrders(List<Orders> orders) {
//			this.orders = orders;
//		}*/
//		public User() {
//			super();
//		}
//		public User(String emailId, String userName, String password,List<Orders> orders) {
//			super();
//			this.emailId = emailId;
//			this.userName = userName;
//			this.password = password;
//			this.orders = orders;
//			
//		}
//		
//		public List<Orders> getOrders() {
//			return orders;
//		}
//		public void setOrders(List<Orders> orders) {
//			this.orders = orders;
//		}
//		public String getId() {
//			return id;
//		}
//		public void setId(String id) {
//			this.id = id;
//		}
//		
//		public String getEmailId() {
//			return emailId;
//		}
//		public void setEmailId(String emailId) {
//			this.emailId = emailId;
//		}
//		public String getUserName() {
//			return userName;
//		}
//		public void setUserName(String userName) {
//			this.userName = userName;
//		}
//		public String getPassword() {
//			return password;
//		}
//		public void setPassword(String password) {
//			this.password = password;
//		}

}
