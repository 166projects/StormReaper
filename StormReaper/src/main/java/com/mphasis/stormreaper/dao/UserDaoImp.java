package com.mphasis.stormreaper.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.stormreaper.entities.User;

@Repository
public class UserDaoImp {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int addUser(User u) {
		 Session session= sessionFactory.getCurrentSession();
		   session.save(u);
		   session.close();
			return 1;
	}

	public void deleteUser(String emailid) {
		 Session session= sessionFactory.getCurrentSession();
		   session.delete(emailid);
		   session.close();

	}

	public User getUserByEmailId(String emailid) {
		Session session=sessionFactory.getCurrentSession();
		User user=(User) session.createCriteria(User.class).add(Restrictions.eq("emailid", emailid));
		session.close();
		return user;
	}

	public void editUser(User u) {
		Session session=sessionFactory.getCurrentSession();
		session.save(u);
		session.close();
		
	}

	

}
