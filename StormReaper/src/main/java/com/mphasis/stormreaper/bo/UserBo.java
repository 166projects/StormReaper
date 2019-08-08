package com.mphasis.stormreaper.bo;

import com.mphasis.stormreaper.entities.User;

public interface UserBo {
	
	public int addUser(User u);
	public void deleteUser(String emailid);
	public User getUserByEmailId(String emailid);
	public void editUser(User u);
	public User loginUser(String emailid, String password);

}
