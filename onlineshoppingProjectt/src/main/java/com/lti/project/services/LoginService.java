package com.lti.project.services;
import java.util.List;

import javax.security.auth.login.LoginException;

import org.springframework.stereotype.Service;

import com.lti.project.beans.Login;

@Service("loginService")
public interface LoginService {
	
	public abstract int addNewUser(Login l);
	
	public abstract Login findUserById(int userId) throws LoginException;

	public abstract long updateContact(int userId,long contact );
	
	public abstract void deleteRecord(int userId);
	
	public abstract List<Login> listOfUser();
	
	public abstract String getPasswordById(int userId);
	
}
