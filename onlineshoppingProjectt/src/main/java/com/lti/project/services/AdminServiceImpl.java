package com.lti.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.project.beans.Admin;
import com.lti.project.dao.AdminDao;
import com.lti.project.exceptions.AdminException;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao dao;
	
	
	public AdminDao getDao() {
		return dao;
	}

	public void setDao(AdminDao dao) {
		this.dao = dao;
	}


	@Override
	public int addNewAdmin(Admin a) {
		
		System.out.println("Service Layer 2 Admin");
		int aId = dao.addNewAdmin(a);
		return aId;
	}

	@Override
	public Admin findAdminById(int aId) throws AdminException {
		Admin aInfo= dao.findAdminById(aId);
		return aInfo;
	}

	@Override
	public long updateContact(int aId, long contact) {
		
		return dao.updateContact(aId, contact);
	}

	@Override
	public void deleteRecord(int aId) {
		dao.deleteRecord(aId);
		
	}

	@Override
	public List<Admin> adminList() {
		List<Admin> adminList=dao.adminList();
		return adminList;

	}



	

}
