package com.mphasis.stormreaper.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="ShipTicket")
@Table(name="ShipTicket")
public class Ticket {
	
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_seq")
	@GenericGenerator(
			name = "ticket_seq",
			strategy = "com.mphasis.griffin.util.StringPrefixedSequenceIdGenerator",
			parameters = {
					@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "4"),
					@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "SR"),
					@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d")})
	*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ticketno;
    @OneToOne
    @JoinColumn(name="passenger_id",nullable=false)
    private Passenger passenger;
    @Column(nullable=false)
	private int seat_no;
	 @Column(nullable=false)
    private String paymenttype;
    @OneToOne
    @JoinColumn(name="schedule_id",nullable=false)
    private Schedule schedule;

    
    
    
	public int getTicketno() {
		return ticketno;
	}

	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}



	public String getPaymenttype() {
		return paymenttype;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Ticket [ticketno=" + ticketno 
				+ ", paymenttype=" + paymenttype + ", schedule=" + schedule + "]";
	}
	
    
    
    
   
}
