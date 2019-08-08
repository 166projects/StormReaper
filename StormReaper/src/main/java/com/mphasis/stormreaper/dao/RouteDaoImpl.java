 package com.mphasis.stormreaper.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mphasis.stormreaper.entities.Route;
	
@Repository
public class RouteDaoImpl implements RouteDao {
		
	@Autowired
		SessionFactory sessionFactory;
		
		public List<Route> getAllRoutes() {
			Session session=sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			List<Route> routes = session.createCriteria(Route.class).list();
			tr.commit();
			session.close();
			return routes; 
		}
  public void addRoute(Route r) {
	Session session=sessionFactory.openSession();
	Transaction tr = session.beginTransaction();
	session.save(r);
	 tr.commit();
	 session.close();
	}
public void deleteRoute(int routeid) {
		Session session=sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Route routes = (Route)session.get(Route.class,routeid);
		session.delete(routes);
		 tr.commit();
		 session.close();
	}
public void editRoute(Route r) {	
	Session session=sessionFactory.openSession();
	Transaction tr = session.beginTransaction();
		session.update(r);
		 tr.commit();
		 session.close();
	}
	public Route getRoutebyId(int routeid) {
		Session  session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Route routes = (Route)session.get(Route.class,routeid);
		tr.commit();
		session.close();
	    return routes;
	}
}
