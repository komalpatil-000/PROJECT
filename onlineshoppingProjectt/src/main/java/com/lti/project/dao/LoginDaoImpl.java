package com.lti.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.security.auth.login.LoginException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.project.beans.Login;

@Repository
public class LoginDaoImpl implements LoginDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public int addNewUser(Login l) {
		System.out.println("Dao layer 1 Login");
		em.persist(l);
		return l.getLoginId();
	}

	@Override
	public Login findUserById(int userId) throws LoginException {
	Login userInfo=em.find(Login.class, userId);
		if (userInfo!=null) {
			return userInfo;
			
		}
		else
		{
			throw new LoginException("User Not Found");
		}
		
		
	}

	@Override
	@Transactional
	public long updateContact(int userId, long contact) {
		
		Login user=em.find(Login.class, userId);
		em.merge(user);
		user.setContact(contact);
		user.getContact();
		return user.getContact();
	}

	@Override
	@Transactional
	public void deleteRecord(int userId) {
		
		Login user=em.find(Login.class, userId);
		em.remove(user);
		System.out.println("Record Deleted");
	}

	@Override
	public List<Login> listOfUser() {
		String sql="select l from Login l";
		Query qry=em.createQuery(sql);
		List<Login>listOfUser=qry.getResultList();
		System.out.println("on db server"+listOfUser);
		
		return listOfUser;
	}

	@Override
	@Transactional
	public String getPasswordById(int userId) {
		
		Login userInfo=em.find(Login.class, userId);
		return userInfo.getPassword();
	}

		
	}
	
	
