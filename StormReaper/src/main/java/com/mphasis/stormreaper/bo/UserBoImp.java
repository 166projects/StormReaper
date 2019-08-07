package com.mphasis.stormreaper.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.stormreaper.dao.UserDao;
import com.mphasis.stormreaper.entities.User;


@Service
public class UserBoImp implements UserBo {
@Autowired
UserDao userDao;
	 public int addUser(User u) {
		userDao.addUser(u);
		return 1;
	}

	public void deleteUser(String emailid) {
		userDao.deleteUser(emailid);
	}

	public User getUserByEmailId(String emailid) {
		User user=userDao.getUserByEmailId(emailid);
		return user;
	}

	public void editUser(User u) {
		userDao.editUser(u);
		
	}

	

}
