package com.mphasis.stormreaper.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.stormreaper.dao.PassengerDao;
import com.mphasis.stormreaper.entities.Passenger;
import com.mphasis.stormreaper.exceptions.BusinessException;

@Service
public class PassengerBoImpl implements PassengerBo {
    
	@Autowired
	PassengerDao passengerDao;
	
	
	public void addPassenger(Passenger p) {
		
		try {
			if(p.getGender().matches("[mMfF]{1}")) {
		passengerDao.addPassenger(p);
		}
		else {
			
				throw new Exception("Invalid Gender");
		}
		}catch (Exception e) {
				e.printStackTrace();
		}
			
		
	}

	public void deletePassenger(int id) {
		
		passengerDao.deletePassenger(id);
	}

	public void editPassenger(Passenger p) {
		
		passengerDao.editPassenger(p);
	}

	public Passenger getPassengerById(int id) {
		
		return passengerDao.getPassengerById(id);
		 
	}

	public List<Passenger> getAllPassengers() {
		
		
		List<Passenger> p= passengerDao.getAllPassengers();
		try {
			if(p.isEmpty())
			{
				throw new Exception("Ship is completely vacant");
			}
		}catch(Exception e) {
				e.printStackTrace();
			
	}
		return p;
}
	
}
