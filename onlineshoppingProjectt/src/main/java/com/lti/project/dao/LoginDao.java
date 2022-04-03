package com.lti.project.dao;

import java.util.List;

import javax.security.auth.login.LoginException;

import com.lti.project.beans.Login;


public interface LoginDao {
	
	public abstract int addNewUser(Login l);

	public abstract Login findUserById(int userId) throws LoginException;
	
	public abstract long updateContact(int userId,long contact );
	
	public abstract void deleteRecord(int userId);
	
	public abstract List<Login> listOfUser();
	
	public abstract String getPasswordById(int userId);

	
}


