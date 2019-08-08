package com.mphasis.stormreaper.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.stormreaper.bo.ScheduleBo;
import com.mphasis.stormreaper.entities.Schedule;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	
	@Autowired
	ScheduleBo scheduleBo;
	@RequestMapping(value="/schedules",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Schedule> getAll()
	{
		return scheduleBo.getSchedules();
	}
	@RequestMapping(value="/add",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void addSchedule(@RequestBody Schedule schedule)
	{
		scheduleBo.addSchedule(schedule);
	}
	@RequestMapping(value="/add",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE)
	public void updateSchedule(@RequestBody Schedule schedule)
	{
			Schedule sd=scheduleBo.getScheduleById(schedule.getScheduleid());
			if(sd!=null)
				scheduleBo.editSchedule(schedule);
			else
				scheduleBo.addSchedule(schedule);
	}	
	@RequestMapping(value="/add/{id}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void deleteSchedule(@PathVariable("id")int id)
	{
		
		scheduleBo.deleteSchedule(id);
	}
	@RequestMapping(value="/Schedules/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public void getScheduleById(@PathVariable("id")int id)
	{
		
		scheduleBo.getScheduleById(id);
	}
}

