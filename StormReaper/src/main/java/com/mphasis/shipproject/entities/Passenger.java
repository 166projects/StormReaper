package com.mphasis.shipproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="ShipPassenger")
@Table(name="ShipPassenger")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int pid;
	 @Column(nullable=false)
	private String pname;
	 @Column(nullable=false)
	private int age;
	 @Column(nullable=false)
	private String gender;
	@Column(nullable=false)
	private String bookingdate;
    @ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ship_id",nullable=false) 
	private Ship ship;
	 
   

	

	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", pname=" + pname + ", age=" + age + ", gender=" + gender + ", bookingdate="
				+ bookingdate + ", ship=" + ship + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}

	
	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	
	

}
