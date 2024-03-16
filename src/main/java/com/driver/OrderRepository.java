package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor;

@Repository
public class OrderRepository {
          HashMap<String, Order> orderDb;
          HashMap<String, DeliveryPartner> deliverpartnerDb;
          
          

		public OrderRepository() {
			super();
			// TODO Auto-generated constructor stub
			
			Map<String, Order> orderDb = new HashMap<>();
			Map<String, DeliveryPartner> deliverpartnerDb = new HashMap<>();
		}

		public void addOrder(Order order) {
			orderDb.put(order.getId(), order);
		}
          
          public void addPartner(String id) {
			deliverpartnerDb.put(id, new DeliveryPartner(id));
		}
          
          public Order getOrderById(String orderid) {
			    return orderDb.get(orderid);
		}
          
        
          public DeliveryPartner getPartnerById(String partnerid) {
			return deliverpartnerDb.get(partnerid);
		}
          
          
          public List<String> getAllOrders() {
			List<String> order = new ArrayList<>();
			for(String orderId : orderDb.keySet()) {
				  order.add(orderId);
			}
			return order;
		}
          
}
