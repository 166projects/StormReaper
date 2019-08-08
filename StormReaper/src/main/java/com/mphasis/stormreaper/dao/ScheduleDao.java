package com.mphasis.stormreaper.dao;

import java.util.List;

import com.mphasis.stormreaper.entities.Passenger;
import com.mphasis.stormreaper.entities.Schedule;

public interface ScheduleDao {
	public List<Schedule> getSchedules();
	public Schedule getScheduleById(int id);
	public void insertSchedule(Schedule schedule);
	public void deleteSchedule(int id);
	public void updateSchedule(Schedule schedule);
}
