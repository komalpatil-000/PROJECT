package com.lti.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.project.beans.Product;
import com.lti.project.exceptions.ProductException;



@Service("productService")
public interface ProductService {

	public abstract int addNewProduct(Product p) ;
	
	public abstract Product findProductById(int prdId);
	
	public abstract String updateProductName(int prdId,String prdName) throws ProductException;
	
	public abstract void deleteRecord(int prdId);
	
	public abstract List<Product> productList();
}
