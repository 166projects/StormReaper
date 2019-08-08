package com.mphasis.stormreaper.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.stormreaper.entities.Ticket;

public class TicketDaoImp implements TicketDao {
@Autowired
SessionFactory sessionFactory; 
	public void addTicket(Ticket t) {
		
		return 0;
	}

	public void editTicket(int ticketno) {
		// TODO Auto-generated method stub

	}

	public void deleteTicket(int ticketno) {
		// TODO Auto-generated method stub

	}

	public List<Ticket> getByTicketno(int ticketno) {
		// TODO Auto-generated method stub
		return null;
	}

}
