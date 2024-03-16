package com.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	public void addOrder(Order order) {
		orderRepository.addOrder(order);
	}
	
	public void addPartner(String id) {
		orderRepository.addPartner(id);
	}
	
	public Order getOrderById(String orderid) {
		return orderRepository.getOrderById(orderid);
	}
	
	public DeliveryPartner getPartnerById(String partnerid) {
		 return orderRepository.getPartnerById(partnerid);
	}
	
	public List<String> getAllOrders() {
		return orderRepository.getAllOrders();
	}
}
