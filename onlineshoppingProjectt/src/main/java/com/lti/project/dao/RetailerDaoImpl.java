package com.lti.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.project.beans.Retailer;
import com.lti.project.exceptions.RetailerException;




@Repository
public class RetailerDaoImpl implements RetailerDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addNewRetailer(Retailer r) {
		System.out.println("Dao layer 3 Retailer");
		em.persist(r);
		return r.getrId();
	}

	@Override
	public Retailer findRetailerById(int retId) {
		Retailer rInfo=em.find(Retailer.class, retId);
		return rInfo;
	}

	@Override
	@Transactional
	public String updateRetailerUserId(int retId, String rUid) {
		Retailer user=em.find(Retailer.class, retId);
		em.merge(user);
		user.setrUid(rUid);
		return user.getrUid();
	}

	@Override
	@Transactional
	public void deleteRecord(int retId) {
		Retailer user=em.find(Retailer.class, retId);
		em.remove(user);
		System.out.println("Record Deleted");
	}

	@Override
	public List<Retailer> retailerList() throws RetailerException{
		String sql="select r from Retailer r";
		Query qry=em.createQuery(sql);
		if (qry!=null) {
			List<Retailer>retailerList=qry.getResultList();
			System.out.println("on db server"+retailerList);
			return retailerList;
		}else
		{
			throw new RetailerException();
		}
		
	}
	
	
	
	
	
	
	

}
