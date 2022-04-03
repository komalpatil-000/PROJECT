package com.lti.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.project.beans.Product;
import com.lti.project.services.ProductServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	@Autowired
	ProductServiceImpl productService ;
	
	//http://localhost:8090/product/productlist
	@GetMapping("/productlist") // Get List of Product
	public List<Product> productList()
	{
		return productService.productList();
	}

	//http://localhost:8090/product/productlist/{id}
	@GetMapping("/productlist/{id}") // Get record by Id
	public Product findUserById(@PathVariable(value="id") int prdId) {
		System.out.println("inside controller of Product");
	return productService.findProductById(prdId);
	}
	
	//http://localhost:8090/product/addproduct
	@PostMapping("/addproduct") // Add new product
	public void addProduct(@RequestBody Product product ) //Add new record
	 { 
		productService.addNewProduct(product);
	 }
	
	
	 
	
	
	
}
