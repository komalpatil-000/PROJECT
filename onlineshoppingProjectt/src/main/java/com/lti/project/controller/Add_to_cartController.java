package com.lti.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lti.project.beans.Add_to_cart;
import com.lti.project.exceptions.Add_to_cartException;
import com.lti.project.services.Add_to_cartServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/cart")
public class Add_to_cartController {

	@Autowired
	Add_to_cartServiceImpl add_to_cartService;
	
	
	//http://localhost:8090/cart/cartlist
	@GetMapping("/cartlist")//Get List 
	public List<Add_to_cart> cartList()
	{
		return add_to_cartService.listOfAdd_to_cart();
	}

	
	//http://localhost:8090/cart/cartlist/{id}
	
	@GetMapping("/cartlist/{id}") // Get record by Id
	public Add_to_cart findCartById(@PathVariable(value="id") int cartId) throws Add_to_cartException {
		System.out.println("inside controller of Add_to_cart");
	return add_to_cartService.findAdd_to_cartById(cartId);
	}
	
	
	//http://localhost:8090/cart/addcart

	@PostMapping("/addcart") 
	public void addCart(@RequestBody Add_to_cart cart ) //Add new record
	 { 
		add_to_cartService.addNewCart(cart);
	 }
	
	
	//http://localhost:8090/cart/updatecart/{cartId}/{loginId}

	@PutMapping(value = "/updatecart/{cartId}/{loginId}")
	public void updateCart(@PathVariable(value = "cartId") int cartId, @PathVariable(value = "loginId") int loginId) {

		System.out.println("inside controller " + cartId + " " + loginId);
		add_to_cartService.updateLoginId(cartId, loginId);
		//employeeService.updateEmp(empId, empSal);
	}
	
	
	
	
	
	
}
