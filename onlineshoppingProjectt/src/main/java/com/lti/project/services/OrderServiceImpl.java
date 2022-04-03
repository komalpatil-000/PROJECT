package com.lti.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.project.beans.Order;
import com.lti.project.dao.OrderDao;
import com.lti.project.exceptions.OrderException;



@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderDao dao;

	public OrderDao getDao() {
		return dao;
	}
	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

	@Override
	public int addNewOrder(Order o) throws OrderException {
		
		System.out.println("Service Layer 5 Order");
		int ordId = dao.addNewOrder(o);
		return ordId;
	}
	@Override
	public Order findOrderById(int ordId) {
		Order ordInfo= dao.findOrderById(ordId);
		return ordInfo;
	}
	@Override
	public int updateQuantity(int ordId, int quantity) {
		
		return dao.updateQuantity(ordId, quantity);
	}
	@Override
	public void deleteRecord(int ordId) {
		dao.deleteRecord(ordId);
	}
	@Override
	public List<Order> orderList() {
		List<Order> orderList=dao.orderList();
		return orderList;

	}
	@Override
	public Order addOrder(Order order, int prdId) {
		
		return dao.addOrder(order, prdId);
	}



}
