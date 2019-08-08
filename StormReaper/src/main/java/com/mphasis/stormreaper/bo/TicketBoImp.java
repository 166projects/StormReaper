package com.mphasis.stormreaper.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.stormreaper.dao.TicketDao;
import com.mphasis.stormreaper.entities.Ticket;
@Service
public class TicketBoImp implements TicketBo {
@Autowired
TicketDao ticketDao;

public Ticket getByTicketno(int ticketno) {
	return ticketDao.getByTicketno(ticketno);
}

public void addTicket(Ticket ticket) {
	 ticketDao.addTicket(ticket);
	
}

public void editTicket(int ticketno) {
	// TODO Auto-generated method stub
	 ticketDao.editTicket(ticketno);
}

public void deleteTicket(int ticketno) {
	 ticketDao.deleteTicket(ticketno);
	
}
}

