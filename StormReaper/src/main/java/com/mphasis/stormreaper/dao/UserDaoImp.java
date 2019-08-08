package com.mphasis.stormreaper.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.stormreaper.entities.User;

@Repository
public class UserDaoImp implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int addUser(User u) {
		 Session session= sessionFactory.openSession();
		 Transaction tr=session.beginTransaction();
		   session.save(u);
		   session.close();
		     tr.commit();
			return 1;
	}

	public void deleteUser(String emailid) {
		 Session session= sessionFactory.openSession();
		 Transaction tr=session.beginTransaction();
		  User u=(User) session.get(User.class, emailid);
		 session.delete(u);
		   session.close();
		   tr.commit();

	}

	public User getUserByEmailId(String emailid) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		User user=(User) session.createCriteria(User.class).add(Restrictions.eq("emailid", emailid));
		tr.commit();
		session.close();
		return user;
	}

	public void editUser(User u) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(u);
		tr.commit();
		session.close();
		
	}

	public User loginUser(String emailid, String password) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		User user=(User) session.createCriteria(User.class).add(Restrictions.eq("emailid", emailid));
		tr.commit();
		session.close();
		return user;
		
	}
	

	

}
