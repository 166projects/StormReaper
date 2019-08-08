package com.mphasis.stormreaper.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.stormreaper.bo.AdminBo;
import com.mphasis.stormreaper.entities.Admin;


@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminBo adminBo;
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public int  addAdmin(Admin a)
	{
		 adminBo.addAdmin(a);
		return 1;
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void removeAdmin(int  aid)
	{
		 adminBo.removeAdmin(aid);
	}
	
	
	@RequestMapping(value="/getadmin", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public void getAdmin(int aid)
	{ 
		adminBo.getAdminById(aid);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
