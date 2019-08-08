package com.mphasis.stormreaper.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.stormreaper.entities.User;

@Repository
public class UserDaoImp {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int addUser(User u) {
		 Session session= sessionFactory.openSession();
		 Transaction tr=session.beginTransaction();
		   session.save(u);
		     tr.commit();
			return 1;
	}

	public void deleteUser(String emailid) {
		 Session session= sessionFactory.openSession();
		 Transaction tr=session.beginTransaction();
		   session.delete(emailid);
		   tr.commit();

	}

	public User getUserByEmailId(String emailid) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		User user=(User) session.createCriteria(User.class).add(Restrictions.eq("emailid", emailid));
		tr.commit();
		return user;
	}

	public void editUser(User u) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(u);
		tr.commit();
		session.close();
		
	}

	

}
