package com.mphasis.stormreaper.entities;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="ShipSchedule")
@Table(name="ShipSchedule")
public class Schedule {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int scheduleid;
    @Column(nullable=false)
	private String Arrivaldetails;
    @Column(nullable=false)
	private String departuredetails;
	
	
	
	public int getScheduleid() {
		return scheduleid;
	}
	public void setScheduleid(int scheduleid) {
		this.scheduleid = scheduleid;
	}
	public String getArrivaldetails() {
		return Arrivaldetails;
	}
	public void setArrivaldetails(String arrivaldetails) {
		Arrivaldetails = arrivaldetails;
	}
	public String getDeparturedetails() {
		return departuredetails;
	}
	public void setDeparturedetails(String departuredetails) {
		this.departuredetails = departuredetails;
	}
	
	@Override
	public String toString() {
		return "Schedule [scheduleid=" + scheduleid + ", Arrivaldetails=" + Arrivaldetails + ", departuredetails="
				+ departuredetails + ", getScheduleid()=" + getScheduleid() + ", getArrivaldetails()="
				+ getArrivaldetails() + ", getDeparturedetails()=" + getDeparturedetails() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
