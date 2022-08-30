package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Orders;
import com.example.demo.entity.Response;
import com.example.demo.entity.User;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.OrdersRepository;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class OrderController {
	
	@Autowired
	private OrdersRepository ordersRepo;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@DeleteMapping("/orders/{id}")
	public ResponseEntity<Response> deleteOrder(@PathVariable String id){
				
		Orders order =new Orders();
		order.setOrderId(id);
		int num = ordersRepo.deleteOrder(order);
		Response response = new Response();
		if(num == 1) {
			response.setResponse("deleted successfully");
			
		}
		else {
			response.setResponse("No data found");
		}
		
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/orders/{id}")
	public ResponseEntity<Response> updateOrder(@PathVariable String id,@RequestBody Orders orders){
				
		Orders order =new Orders();
		order.setOrderId(id);
		order.setOrderPrice(orders.getOrderPrice());
		int num = ordersRepo.updateOrder(order);
		Response response = new Response();
		if(num == 1) {
			response.setResponse("updated successfully");
			
		}
		else {
			response.setResponse("No data found");
		}
		
		return ResponseEntity.ok(response);
	}
	
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<User> getOrderByUserId(@PathVariable String id) {
		User user = orderRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		
		return ResponseEntity.ok(user);
	}

}
