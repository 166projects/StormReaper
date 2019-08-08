package com.mphasis.stormreaper.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.stormreaper.entities.Admin;

@Repository
public class AdminDaoImp implements AdminDao {
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int addAdmin(Admin a) {
	    Session session= sessionFactory.openSession();
	   Transaction tr=session.beginTransaction();
	    session.save(a);
	    tr.commit();
	   session.close();
	  
		return 1;
	    
	}

	public void removeAdmin(int  aid) {
		Session session= sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
	    Admin a=(Admin) session.get(Admin.class, aid); 
		session.delete(a);
		   tr.commit();
		   session.close();


	}

	public Admin getAdminById(int aid) {
		Session session= sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		   Admin admin=(Admin) session.createCriteria(Admin.class).add(Restrictions.eq("aid",aid));
		   tr.commit();
		   session.close();
		   return admin;
	}

	public Admin loginAdmin(int aid, String adminpassword) {
		Session session= sessionFactory.openSession();
		 Transaction tr=session.beginTransaction();
		   Admin admin=(Admin) session.createCriteria(Admin.class).add(Restrictions.eq("aid",aid));
		   tr.commit();
		   session.close();
		   return admin;
	
	}
	

}
