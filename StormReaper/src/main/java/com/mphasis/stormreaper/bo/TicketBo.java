package com.mphasis.stormreaper.bo;

import com.mphasis.stormreaper.entities.Ticket;
import com.mphasis.stormreaper.entities.Ticket;
import com.mphasis.stormreaper.entities.User;

public interface TicketBo {
	public Ticket getByTicketno(int ticketno);
	public void addTicket(Ticket t);
	public void editTicket(int t);
	public void deleteTicket(int id);

}
