package com.mphasis.stormreaper.dao;

import com.mphasis.stormreaper.entities.Passenger;
import com.mphasis.stormreaper.entities.User;

public interface UserDao {
	public int addUser(User u);

	public void deleteUser(String emailid);

	public User getUserByEmailId(String emailid);

	public void editUser(User u); 
}
