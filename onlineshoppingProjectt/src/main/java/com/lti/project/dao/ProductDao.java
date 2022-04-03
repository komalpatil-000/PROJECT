package com.lti.project.dao;

import java.util.List;

import com.lti.project.beans.Product;
import com.lti.project.exceptions.ProductException;



public interface ProductDao {

	public abstract int addNewProduct(Product p) ;
	
	public abstract Product findProductById(int prdId); 
	
	public abstract String updateProductName(int prdId,String prdName) throws ProductException;
	
	public abstract void deleteRecord(int prdId);
	
	public abstract List<Product> productList();
	
	
}
