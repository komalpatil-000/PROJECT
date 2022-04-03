package com.lti.project.controller;

import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.project.beans.Login;
import com.lti.project.services.LoginServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/login")
public class LoginController {
	
	
	@Autowired
	LoginServiceImpl loginService ;
	
	
	//http://localhost:8090/login/loginlist

	@GetMapping("/loginlist") //Get List
	public List<Login> loginList()
	{
		return loginService.listOfUser();
	}
	
	//http://localhost:8090/login/loginlist/{id}
	@GetMapping("/loginlist/{id}") // Get record by Id
	public Login findUserById(@PathVariable(value="id") int userId) throws LoginException {
		System.out.println("inside controller of Login");
	return loginService.findUserById(userId);
	}
	
	//http://localhost:8090/login/addlogin
	@PostMapping("/addlogin") 
	public void addLogin(@RequestBody Login login ) //Add new record
	 { 
		loginService.addNewUser(login);
	 }
	
	//http://localhost:8090/login/getpassword/{id}
	@GetMapping("/getpassword/{id}") 
	public String getPasswordById(@PathVariable(value="id") int userId) {
	 
		return loginService.getPasswordById(userId) ;
	}
	
	
	
	
	
	
}
