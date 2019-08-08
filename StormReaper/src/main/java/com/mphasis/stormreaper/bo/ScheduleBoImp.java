package com.mphasis.stormreaper.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.stormreaper.dao.ScheduleDao;
import com.mphasis.stormreaper.entities.Schedule;

@Service
public class ScheduleBoImp implements ScheduleBo {
	@Autowired
	ScheduleDao scheduleDao;
	
	public List<Schedule> getSchedules() {
		// TODO Auto-generated method stub
		List<Schedule> schedules=scheduleDao.getSchedules();
		/*if(schedules.isEmpty())
		{
			
			throw new BuisnessException("NO DATA");
		}*/
		return schedules;
	}

	public Schedule getScheduleById(int id) {
		// TODO Auto-generated method stub
		return scheduleDao.getScheduleById(id);
	}

	public void addSchedule(Schedule schedule) {
	scheduleDao.addSchedule(schedule);
			

	}

	public void editSchedule(Schedule schedule) {
		scheduleDao.editSchedule(schedule);
	}

	public void deleteSchedule(int id) {
		scheduleDao.deleteSchedule(id);
	}

}
