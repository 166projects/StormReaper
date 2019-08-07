package com.mphasis.stormreaper.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.stormreaper.entities.Admin;

@Repository
public class AdminDaoImp {
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	public int addAdmin(Admin a) {
	    Session session= sessionFactory.getCurrentSession();
	   session.save(a);
	   session.close();
	  
		return 1;
	    
	}

	public void removeAdmin(int  aid) {
		Session session= sessionFactory.getCurrentSession();   
		   session.delete(aid);
		   session.close();


	}

	public Admin getAdmin(int aid) {
		Session session= sessionFactory.getCurrentSession();
		   
		   //List<Assignament> assisnments = session.createCriteria(Assignament.class).list();
		   Admin admin=(Admin) session.createCriteria(Admin.class).add(Restrictions.eq("aid",aid));
		   session.close();
		   return admin;
	}
	

}
