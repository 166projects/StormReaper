package com.mphasis.stormreaper.dao;

import java.util.List;

import com.mphasis.stormreaper.entities.Passenger;

public interface PassengerDao {
	public void addPassenger(Passenger p); 
	public void deletePassenger(int id);
	public void editPassenger(Passenger p);
	public Passenger getPassengersById(int id);
	public List<Passenger> getAllPassengers();
	
}
