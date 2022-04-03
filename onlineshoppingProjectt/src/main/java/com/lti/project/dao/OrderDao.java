package com.lti.project.dao;

import java.util.List;

import com.lti.project.beans.Order;
import com.lti.project.exceptions.OrderException;


public interface OrderDao {

	public abstract int addNewOrder(Order o) throws OrderException ;
	
	public abstract Order findOrderById(int ordId);
	
	public abstract int updateQuantity(int ordId,int quantity);
	
	public abstract void deleteRecord(int ordId);
	
	public abstract List<Order> orderList();
	
	public abstract Order addOrder(Order order,int prdId);
}
