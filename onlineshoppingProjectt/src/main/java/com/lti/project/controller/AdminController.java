package com.lti.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.lti.project.beans.Admin;
import com.lti.project.exceptions.AdminException;
import com.lti.project.services.AdminServiceImpl;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminServiceImpl adminService ;
	
	//http://localhost:8090/admin/adminlist	
	@GetMapping("/adminlist") //Get list
	public List<Admin> adminList()
	{
		return adminService.adminList();
	}
	
	//http://localhost:8090/admin/adminlist/{id}
	@GetMapping("/adminlist/{id}") // Get record by Id
	public Admin findAdminById(@PathVariable(value="id") int aId) throws AdminException {
		System.out.println("inside controller of Admin");
	return adminService.findAdminById(aId);
	}
	
	//http://localhost:8090/admin/addadmin
	@PostMapping("/addadmin") 
	public void addAdmin(@RequestBody Admin admin ) //Add new record
	 { 
		adminService.addNewAdmin(admin);
	 }
	
//	@DeleteMapping("retail/{id}")
//    public String deleteById(@PathVariable("id") int id) {
//	   adminService.deleteRecord(id);
//	   return id+"id is deleted";
//	
//	}
}	
