package com.lti.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.project.beans.Add_to_cart;
import com.lti.project.dao.Add_to_cartDao;
import com.lti.project.exceptions.Add_to_cartException;


@Service("add_to_cartService")
public class Add_to_cartServiceImpl implements Add_to_cartService{
	
	@Autowired
	Add_to_cartDao dao;
	
	public Add_to_cartDao getDao() {
		return dao;
	}

	public void setDao(Add_to_cartDao dao) {
		this.dao = dao;
	}

	@Override
	public int addNewCart(Add_to_cart ac) {
		
		System.out.println("Service Layer 6 Add_to_cart");
		int cartId = dao.addNewCart(ac);
		return cartId;
	}

	@Override
	public Add_to_cart findAdd_to_cartById(int cartId ) throws Add_to_cartException{
		Add_to_cart cartInfo= dao.findAdd_to_cartById(cartId);
		return cartInfo;
	}

	@Override
	public int updateLoginId(int cartId, int loginId) {
		return dao.updateLoginId(cartId, loginId);
		
	}

	@Override
	public void deleteLoginId(int cartId) {
		
		dao.deleteLoginId(cartId);
		
	}

	@Override
	public List<Add_to_cart> listOfAdd_to_cart() {
		List<Add_to_cart> add_to_cartList=dao.listOfAdd_to_cart();
		return add_to_cartList;

	}


}
