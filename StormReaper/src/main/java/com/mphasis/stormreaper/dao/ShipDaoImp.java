package com.mphasis.stormreaper.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mphasis.stormreaper.entities.Ship;

@Repository
public class ShipDaoImp implements ShipDao {

@Autowired
	SessionFactory sessionFactory;
	
	public int addShip(Ship sh) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		   session.save(sh);
		   tr.commit();
		   session.close();
			return 1;
		}
   public void editShip(Ship sh) {
	   Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		   session.update(sh);
		   tr.commit();
		   session.close();
}
   public void deleteShip(int shipid) {
	Session session=sessionFactory.openSession();
	Transaction tr=session.beginTransaction();
		Ship ship=(Ship) session.get(Ship.class,shipid); 
	   session.delete(shipid);
		   tr.commit();
		   session.close();
	}

public Ship getShipById(int shipid) {
	Session session=sessionFactory.openSession();
	Transaction tr=session.beginTransaction();
		Ship ship=(Ship) session.createCriteria(Ship.class).add(Restrictions.eq("shipid", shipid));
		tr.commit();
		session.close();
		return ship;
	}
public Ship getShipByName(String shipname) {
	Session session=sessionFactory.openSession();
	Transaction tr=session.beginTransaction();
	Ship ship=(Ship) session.createCriteria(Ship.class).add(Restrictions.eq("shipname", shipname));
	tr.commit();
	session.close();
	return ship;
}

public List<Ship> getAllShips(){
	List<Ship> ships=null;
	Session session=sessionFactory.openSession();
	Transaction tr=session.beginTransaction();
	 ships=(List<Ship>) session.createCriteria(Ship.class).list();
	tr.commit();
	session.close();
	return ships; 
}


}

