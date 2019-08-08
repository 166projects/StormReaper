package com.mphasis.stormreaper.bo;

import java.util.List;

import com.mphasis.stormreaper.entities.Route;
import com.mphasis.stormreaper.entities.Schedule;

public interface ScheduleBo {
	public List<Schedule> getSchedules();
	public Schedule getScheduleById(int id);
	public void addSchedule(Schedule schedule);
	public void editSchedule(Schedule schedule);
	public void removeSchedule(int id);

}
