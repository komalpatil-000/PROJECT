package com.lti.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.project.beans.Retailer;
import com.lti.project.exceptions.RetailerException;



@Service("retailerService")
public interface RetailerService {
	
	public abstract int addNewRetailer(Retailer r);

	public abstract Retailer findRetailerById(int retId);
	
	public abstract String updateRetailerUserId(int retId,String rUid);
	
	public abstract void deleteRecord(int retId);
	
	public abstract List<Retailer> retailerList() throws RetailerException; 

}
