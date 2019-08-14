package com.mphasis.stormreaper.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.stormreaper.entities.Passenger;


@Repository
public class PassengerDaoImpl implements PassengerDao {
    
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void addPassenger(Passenger p) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(p);
		tr.commit();
		session.close();
	}

	public void deletePassenger(String id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Passenger p=(Passenger) session.get(Passenger.class, id);
		session.delete(p);
		tr.commit();
		session.close();
	}

	public void editPassenger(Passenger p) {
		
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(p);
		tr.commit();
		session.close();
	   
	}

	public Passenger getPassengerById(String id) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Passenger p=(Passenger) session.get(Passenger.class, id);
		tr.commit();
		session.close();
		return p;
		
	}

	public List<Passenger> getAllPassengers() {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		List<Passenger> p=session.createCriteria(Passenger.class).list();
		tr.commit();
		session.close();
		return p;
		
	}

	
}
