package com.mphasis.stormreaper.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mphasis.stormreaper.bo.PassengerBo;
import com.mphasis.stormreaper.bo.UserBo;
import com.mphasis.stormreaper.entities.Passenger;
import com.mphasis.stormreaper.entities.User;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserBo userBo;
	
	@Autowired
	PassengerBo passengerBo;
	
	@RequestMapping(value="/addpassenger",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
    public int addPassenger(Passenger p)
    {
		passengerBo.addPassenger(p);
		return  1;
		
    }
	
	@RequestMapping(value="/adduser",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
    public int addUser(User u)
    {
		userBo.addUser(u);
		return 1;
		
    }
	
	@RequestMapping(value="/deleteuser",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
    public void deleteUser(String emailid)
    {
		userBo.deleteUser(emailid);
		
		
    }
	
	@RequestMapping(value="/edituser", method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public void editUser(User u)
	{
		 userBo.editUser(u);
	}
	
	@RequestMapping(value="/getuserbyemailid", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public User getByEmailId(String emailid)
	{
		return userBo.getUserByEmailId(emailid);
	}
	
	
	@RequestMapping(value="/deletepassenger",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
    public void deletePassenger(int pid)
    {
		passengerBo.deletePassenger(pid);
	
    }
	
	@RequestMapping(value="/editpasseneger",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
    public void editPassenger(Passenger p)
    {
		passengerBo.editPassenger(p);
		
    }
	
	
}
