package com.mphasis.stormreaper.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.stormreaper.entities.Schedule;

@Repository
@Transactional
public class ScheduleDaoImp implements ScheduleDao {

	@Autowired
	SessionFactory sessionFactory;
	public List<Schedule> getSchedules() {
		Session session= sessionFactory.openSession();
		List<Schedule> schedules=session.createCriteria(Schedule.class).list();
		return schedules;
	}

	public Schedule getScheduleById(int id) {
		Session session=sessionFactory.openSession();
		Schedule schedule=(Schedule) session.get(Schedule.class,id);
		session.close();
		return schedule;
	}

	public void insertSchedule(Schedule schedule) {
		Session session=sessionFactory.openSession();
		session.save(schedule);
		session.close();
		
	}

	public void deleteSchedule(int id) {
		Session session=sessionFactory.openSession();
		Schedule schedule=(Schedule) session.get(Schedule.class,id);
		session.delete(schedule);
		session.close();

	}

	
	public void updateSchedule(Schedule schedule) {
		Session session=sessionFactory.openSession();
		session.update(schedule);
		session.close();
		
	}

}