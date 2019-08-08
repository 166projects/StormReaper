package com.mphasis.stormreaper.dao;

import java.util.List;

import com.mphasis.stormreaper.entities.Ship;

public interface ShipDao {
	public int addShip(Ship sh);
  	public void deleteShip(int shipid);
  	public void editShip(Ship sh);
  	public Ship getShipById(int shipid);
	public Ship getShipByName(String shipname);
	public List<Ship> getAllShips();  
	
}
