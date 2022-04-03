package com.lti.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.project.beans.Admin;
import com.lti.project.exceptions.AdminException;



@Service("adminService")
public interface AdminService {

	public abstract int addNewAdmin(Admin a);

	public Admin findAdminById(int aId) throws AdminException;
	
	public abstract long updateContact(int aId,long contact);
	
	public abstract void deleteRecord(int aId);
	
	public abstract List<Admin> adminList();
	
}
