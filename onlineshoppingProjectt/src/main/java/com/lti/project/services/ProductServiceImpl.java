package com.lti.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.project.beans.Product;
import com.lti.project.dao.ProductDao;
import com.lti.project.exceptions.ProductException;



@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;

	public ProductDao getDao() {
		return dao;
	}


	public void setDao(ProductDao dao) {
		this.dao = dao;
	}


	@Override
	public int addNewProduct(Product p) {
		
		System.out.println("Service Layer 4 Product");
		int pId = dao.addNewProduct(p);
		return pId;
	}


	@Override
	public Product findProductById(int prdId) {
		Product prdInfo= dao.findProductById(prdId);
		return prdInfo;
	}


	@Override
	public String updateProductName(int prdId, String prdName) throws ProductException  {
		
		return dao.updateProductName(prdId, prdName);
	}


	@Override
	public void deleteRecord(int prdId) {
		dao.deleteRecord(prdId);
	}


	@Override
	public List<Product> productList() {
		List<Product> productList=dao.productList();
		return productList;

	}


}
