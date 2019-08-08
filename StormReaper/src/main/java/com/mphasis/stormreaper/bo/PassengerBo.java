package com.mphasis.stormreaper.bo;

import java.util.List;

import com.mphasis.stormreaper.entities.Passenger;
import com.mphasis.stormreaper.entities.User;

public interface PassengerBo {
	public void addPassenger(Passenger p);
	public void deletePassenger(int id);
	public void editPassenger(Passenger p);
	public Passenger getPassengersById(int id);
	public List<Passenger> getAllPassengers();
}
