package com.mphasis.stormreaper.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mphasis.stormreaper.entities.Ticket;

@Repository
public class TicketDaoImp implements TicketDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void addTicket(Ticket t) {	
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(t);
		tr.commit();
		session.close();	
	}

	public void editTicket(int ticketno) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(ticketno);
		tr.commit();
		session.close();

	}

	public void deleteTicket(int ticketno) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(ticketno);
		tr.commit();
		session.close();
	}

	public Ticket getByTicketno(int ticketno) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Ticket Ticket=(Ticket) session.get(Ticket.class,ticketno);
		session.close();
		tr.commit();
		return Ticket;
	}

}
