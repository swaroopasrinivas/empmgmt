package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Orders;
import com.example.demo.entity.User;

@Repository
public class OrdersRepository extends BaseDAO {
	
	public int deleteOrder(Orders order) {
		int delInfo = 0;
		try {
			String sql = "DELETE FROM Orders WHERE OrderId =? ";
			delInfo = getJdbcTemplate().update(sql, order.getOrderId());
		} catch (Exception e) {
		System.out.println(e);
		}
		return delInfo;
		
		
	}
	
	public int updateOrder(Orders order) {
		int updateInfo = 0;
		try {
			updateInfo = getJdbcTemplate().update("UPDATE Orders set orderPrice = ? WHERE OrderId =?",
					order.getOrderPrice(),order.getOrderId());
			
		} catch (Exception e) {
		System.out.println(e);
		}
		return updateInfo;
		
		
	}

	/*public User getOrderDetails() {
		
		
		
		return null;
		
	}*/

}
