package com.lti.project.services;

import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.project.beans.Login;
import com.lti.project.dao.LoginDao;



@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao dao;
	
	public LoginDao getDao() {
		return dao;
	}

	public void setDao(LoginDao dao) {
		this.dao = dao;
	}





	
	@Override
	public int addNewUser(Login l) {
			System.out.println("Service layer 1 Login");
			int loginId=dao.addNewUser(l);
			return loginId;
		}

	@Override
	public Login findUserById(int userId) throws LoginException{
		Login userInfo= dao.findUserById(userId);
		return userInfo;
	}

	@Override
	public long updateContact(int userId, long contact) {
		
		return dao.updateContact(userId, contact);
		
	}

	@Override
	public void deleteRecord(int userId) {
		dao.deleteRecord(userId);
		
	}

	@Override
	public List<Login> listOfUser() {
		List<Login> listOfUser=dao.listOfUser();
		return listOfUser;

	}

	@Override
	public String getPasswordById(int userId) {
		String pass= dao.getPasswordById(userId);
		
		return pass;
	}
	
	
	
	}


