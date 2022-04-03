package com.lti.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.project.beans.Admin;
import com.lti.project.exceptions.AdminException;

@Repository
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public int addNewAdmin(Admin a) {
		
		System.out.println("Dao layer 2 Admin");
		em.persist(a);
		return a.getaId();
		
	}



	@Override
	public Admin findAdminById(int aId) throws AdminException {
		Admin aInfo=em.find(Admin.class, aId);
		if (aInfo!=null) {
			return aInfo;

		}
		else
		{
			throw new AdminException("Admin Not Forund");
		}
		
}



	@Override
	@Transactional
	public long updateContact(int aId, long contact) {
		Admin user=em.find(Admin.class, aId);
		em.merge(user);
		user.setaContact(contact);
		user.getaContact();
		return user.getaContact();
	}



	@Override
	@Transactional
	public void deleteRecord(int aId) {
		Admin user=em.find(Admin.class, aId);
		em.remove(user);
		System.out.println("Record Deleted");
		}



	@Override
	public List<Admin> adminList() {
		String sql="select a from Admin a";
		Query qry=em.createQuery(sql);
		List<Admin>adminList=qry.getResultList();
		System.out.println("on db server"+adminList);
		
		return adminList;
	}



	
}
