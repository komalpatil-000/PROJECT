package com.lti.project.dao;

import java.util.List;

import com.lti.project.beans.Admin;
import com.lti.project.exceptions.AdminException;




public interface AdminDao {
	
	public abstract int addNewAdmin(Admin a);

	public abstract Admin findAdminById(int aId) throws AdminException;
	
	public abstract long updateContact(int aId,long contact);
	
	public abstract void deleteRecord(int aId);
	
	public abstract List<Admin> adminList();
	
	

}
