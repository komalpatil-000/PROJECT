package com.lti.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.project.beans.Product;
import com.lti.project.exceptions.ProductException;

@Repository
public class ProductDaoImpl implements ProductDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@Transactional
	public int addNewProduct(Product p) {
		System.out.println("Dao layer 4 Products");
		em.persist(p);
		return p.getPrdId();
		
	}


	@Override
	
	public Product findProductById(int prdId) {
		Product prdInfo=em.find(Product.class, prdId);
		
		return prdInfo;
	}


	@Override
	@Transactional
	public String updateProductName(int prdId, String prdName) throws ProductException {
		Product user=em.find(Product.class, prdId);
		if (user!= null) {
			em.merge(user);
			user.setPrdName(prdName);
			return user.getPrdName();
		}else
		{
			throw new ProductException("Product Not Found");
		}
		
	}


	@Override
	@Transactional
	public void deleteRecord(int prdId) {
		Product user=em.find(Product.class, prdId);
		em.remove(user);
		System.out.println("Record Deleted");
	}


	@Override
	public List<Product> productList() {
		String sql="select p from Product p";
		Query qry=em.createQuery(sql);
		List<Product>productList=qry.getResultList();
		System.out.println("on db server"+productList);
		
		return productList;
	}

	
	
	
}
