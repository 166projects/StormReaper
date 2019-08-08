package com.mphasis.stormreaper.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.stormreaper.dao.AdminDao;
import com.mphasis.stormreaper.entities.Admin;



@Service
public class AdminBoImp implements AdminBo {

	@Autowired
	 AdminDao adminDao;
	
	

	public void removeAdmin(int aid) {
		  adminDao.removeAdmin(aid);

	}

	
	public Admin getAdmin(int aid) {
		Admin admin=adminDao.getAdmin(aid);
		 return admin;
	}

	public int addAdmin(Admin a) {
		 adminDao.addAdmin(a);
			return 1;
	}

	
}
