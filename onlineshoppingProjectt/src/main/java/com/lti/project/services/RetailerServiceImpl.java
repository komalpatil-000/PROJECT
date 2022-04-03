package com.lti.project.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.project.beans.Retailer;
import com.lti.project.dao.RetailerDao;
import com.lti.project.exceptions.RetailerException;



@Service("retailerService")
public class RetailerServiceImpl implements RetailerService {

	@Autowired
	RetailerDao dao ;
	
	public RetailerDao getDao() {
		return dao;
	}

	public void setDao(RetailerDao dao) {
		this.dao = dao;
	}

	@Override
	public int addNewRetailer(Retailer r) {
		
		System.out.println("Service layer 3 Retailer");
		int rId = dao.addNewRetailer(r);
		
		return rId;
	}

	@Override
	public Retailer findRetailerById(int retId) {
		Retailer rInfo= dao.findRetailerById(retId);
		return rInfo;
	}

	@Override
	public String updateRetailerUserId(int retId, String rUid) {
		
		return dao.updateRetailerUserId(retId, rUid);
	}

	@Override
	public void deleteRecord(int retId) {
		dao.deleteRecord(retId);
		
	}

	@Override
	public List<Retailer> retailerList() throws RetailerException {
		List<Retailer> retailerList=dao.retailerList();
		return retailerList;

	}
}
