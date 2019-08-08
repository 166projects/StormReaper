package com.mpahsis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mpahsis.beans.Passenger;
import com.mpahsis.beans.User;
import com.mpahsis.bo.PassengerBo;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

	
	
	
	
	@RequestMapping(value="/edit",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
    public void editPassenger(Passenger p)
    {
		passengerBo.editPassenger(p);
		
    }
	@RequestMapping(value="/get",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
    public Passenger getpassengerById(int pid)
    {
		return passengerBo.getPassengerById(pid);
		
		
    }
	
	
	
	
}
