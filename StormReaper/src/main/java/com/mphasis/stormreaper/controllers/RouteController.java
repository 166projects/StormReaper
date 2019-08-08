package com.mpahsis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mpahsis.beans.Route;
import com.mpahsis.beans.User;
import com.mpahsis.bo.RouteBo;

@RestController
@RequestMapping("/routes")
public class RouteController {

	
	@Autowired
	RouteBo routeBo;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
    public int addRoute(Route r)
    {
		routeBo.addRoute(r);
		return 1;
		
    }
	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
    public void deleteRoute(int routeid)
    {
		routeBo.deleteRoute(routeid);
		
		
    }
	
	/*@RequestMapping(value="/edit", method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public void editUser(User u)
	{
		 userBo.editUser(u);
	}
	
	@RequestMapping(value="/getbyemailid", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public User getByEmailId(String emailid)
	{
		return userBo.getUserByEmailId(emailid);
	}*/
	
}
