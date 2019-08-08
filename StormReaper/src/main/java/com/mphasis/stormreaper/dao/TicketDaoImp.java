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

	public void editTicket(Ticket t) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(t);
		tr.commit();
		session.close();

	}

	public void deleteTicket(int ticketno) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Ticket  t=(Ticket) session.get(Ticket.class, ticketno);
		session.delete(t);
		tr.commit();
		session.close();
	}

	public Ticket getByTicketno(int ticketno) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Ticket ticket=(Ticket) session.get(Ticket.class,ticketno);	
		tr.commit();
		session.close();
		return ticket;
	}

	public List<Ticket> getAllTickets() {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		List<Ticket> tickets=session.createCriteria(Ticket.class).list();
		tr.commit();
		session.close();
		return tickets;
	}

}
