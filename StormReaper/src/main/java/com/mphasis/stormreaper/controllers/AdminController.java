package com.mphasis.stormreaper.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.stormreaper.bo.AdminBo;
import com.mphasis.stormreaper.bo.PassengerBo;
import com.mphasis.stormreaper.bo.RouteBo;
import com.mphasis.stormreaper.entities.Admin;
import com.mphasis.stormreaper.entities.Passenger;
import com.mphasis.stormreaper.entities.Route;


@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminBo adminBo;
	
	@Autowired
	PassengerBo passengerBo;
	
	@Autowired
	RouteBo routeBo;
	
	@RequestMapping(value="/addroute",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
    public int addRoute(Route r)
    {
		routeBo.addRoute(r);
		return 1;
		
    }
	
	@RequestMapping(value="/deleteroute",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
    public void deleteRoute(int routeid)
    {
		routeBo.deleteRoute(routeid);
		
		
    }
	
	@RequestMapping(value="/addadmin",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public int  addAdmin(Admin a)
	{
		 adminBo.addAdmin(a);
		return 1;
	}
	
	@RequestMapping(value="/deleteadmin",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void removeAdmin(int  aid )
	{
		 adminBo.removeAdmin(aid);
	}
	
	
	@RequestMapping(value="/getadmin", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public void getAdmin(int aid)
	{ 
		adminBo.getAdminById(aid);
	}
	
	@RequestMapping(value="/getpassengerbyid",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
    public Passenger getpassengerById(int pid)
    {
		return passengerBo.getPassengerById(pid);
		
		
    }
	@RequestMapping(value="/getallpassengers",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Passenger> getAllPassengers()
    {
		return passengerBo.getAllPassengers();
		
		
    }
	
	
	
	
	
	
	
	
	
	
	
	
}
