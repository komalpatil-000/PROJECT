package com.lti.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.project.beans.Order;
import com.lti.project.beans.Product;
import com.lti.project.exceptions.OrderException;



@Repository
public class OrderDaoImpl implements OrderDao{


	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@Transactional
	public int addNewOrder(Order o) throws OrderException {
		System.out.println("Dao layer 5 Order");
		if (o !=null) {
			em.persist(o);
			return o.getOrdId();
		}
		else
		{
			throw new OrderException("Query is wrong");
		}		
	}


	@Override
	public Order findOrderById(int ordId) {
		Order ordInfo=em.find(Order.class, ordId);
		
		return ordInfo;
	}


	@Override
	@Transactional
	public int updateQuantity(int ordId, int quantity) {
		Order user=em.find(Order.class, ordId);
		em.merge(user);
		user.setQuantity(quantity);
		return user.getQuantity();
	}


	@Override
	@Transactional
	public void deleteRecord(int ordId) {
		Order user=em.find(Order.class, ordId);
		em.remove(user);
		System.out.println("Record Deleted");
	}


	@Override
	public List<Order> orderList() {
		String sql="select o from Order o";
		Query qry=em.createQuery(sql);
		List<Order>adminList=qry.getResultList();
		System.out.println("on db server"+adminList);
		
		return adminList;
	}


	@Override
	@Transactional
	public Order addOrder(Order order,int prdId) {
		
		Product prd = em.find(Product.class,prdId);
		if (prd == null) {

		} else {

			order.setPrdId(prdId);
			em.persist(order);
		}
		return order;
	}

	
	
	
	
}
