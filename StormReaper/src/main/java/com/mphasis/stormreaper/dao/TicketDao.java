package com.mphasis.stormreaper.dao;

import java.util.List;

import com.mphasis.stormreaper.entities.Passenger;
import com.mphasis.stormreaper.entities.Ticket;

public interface TicketDao {
	public void addTicket(Ticket t);
	public void editTicket(Ticket t);
	public void deleteTicket(int ticketno);
	public Ticket getByTicketno(int ticketno);
	public List<Ticket> getAllTickets(); 
}
