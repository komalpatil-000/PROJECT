package com.lti.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.project.beans.Add_to_cart;
import com.lti.project.exceptions.Add_to_cartException;



@Service("add_to_cartService")
public interface Add_to_cartService {

	
	public abstract int addNewCart(Add_to_cart ac);
	
	public abstract Add_to_cart findAdd_to_cartById(int cartId) throws Add_to_cartException;
	
	public abstract int updateLoginId(int cartId,int loginId);
	
	public abstract void deleteLoginId(int cartId);
	
	public abstract List<Add_to_cart> listOfAdd_to_cart();
	
	
	
	
}
