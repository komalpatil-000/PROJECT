package com.lti.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.project.beans.Order;
import com.lti.project.exceptions.OrderException;
import com.lti.project.services.OrderServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	@Autowired
	OrderServiceImpl orderService ;
	
	//http://localhost:8090/order/orderlist
	@GetMapping("/orderlist")  // Get List
	public List<Order> orderList()
	{
		return orderService.orderList();
	}
	
	//http://localhost:8090/order/orderlist/{id}
	@GetMapping("/orderlist/{id}") // Get record by Id
	public Order findUserById(@PathVariable(value="id") int ordId) {
		System.out.println("inside controller of Order");
	return orderService.findOrderById(ordId);
	}
	
	
	//http://localhost:8090/order/addorder
	@PostMapping("/addorder")  // add new order
	public void addOrder(@RequestBody Order order ) throws OrderException //Add new record
	 { 
		orderService.addNewOrder(order);
	 }

	
//	@PostMapping(value = "/addorder/{prdId}") 
//	public void addOrder(@PathVariable(value = "prdId") int prdId, @RequestBody Order order) throws OrderException{
//
//		System.out.println("inside controller " + order);
//		orderService.addOrder(order, prdId);
//
//	}
//	
	
	
}
