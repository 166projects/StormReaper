package com.mphasis.stormreaper.bo;

import com.mphasis.stormreaper.entities.Admin;

public interface AdminBo {
	
	public  int addAdmin(Admin a);
	public void removeAdmin(int  aid);
	public Admin getAdmin(int aid);

}
