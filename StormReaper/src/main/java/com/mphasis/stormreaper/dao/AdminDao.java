package com.mphasis.stormreaper.dao;

import com.mphasis.stormreaper.entities.Admin;

public interface AdminDao {
	
	public  int addAdmin(Admin a);
	public void removeAdmin(int  aid);
	public Admin getAdmin(int aid);

}
