package com.lti.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.lti.project.beans.Add_to_cart;
import com.lti.project.exceptions.Add_to_cartException;



@Repository
public class Add_to_cartDaoImpl implements Add_to_cartDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@Transactional
	public int addNewCart(Add_to_cart ac) {
		System.out.println("Dao layer 6 Add_to_cart");
		em.persist(ac);
		return ac.getCartId();
		
	}


	@Override
	public Add_to_cart findAdd_to_cartById(int cartId) throws Add_to_cartException{
		Add_to_cart cartInfo=em.find(Add_to_cart.class, cartId);
		if (cartInfo!=null) {
			
			return cartInfo;
			
		}
		else
		{
			throw new Add_to_cartException("Cart is null");
		}
		
		
	}


	@Override
	@Transactional
	public int updateLoginId(int cartId, int loginId) {
		Add_to_cart user=em.find(Add_to_cart.class, cartId);
		em.merge(user);
		user.setLoginId(loginId);
		
		return user.getLoginId();
		
	}


	@Override
	@Transactional
	public void deleteLoginId(int cartId) {
		Add_to_cart user=em.find(Add_to_cart.class, cartId);
		em.remove(user);
		System.out.println("Record Deleted");
		
	}


	@Override
	public List<Add_to_cart> listOfAdd_to_cart() {
		String sql="select cart from Add_to_cart cart";
		Query qry=em.createQuery(sql);
		List<Add_to_cart>add_to_cartList=qry.getResultList();
		System.out.println("on db server"+add_to_cartList);
		
		return add_to_cartList;
	}
	
	
	
}
