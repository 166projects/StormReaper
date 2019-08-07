package com.mphasis.shipproject.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="ShipRoute")
@Table(name="ShipRoute")
public class Route {
    @Id	
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int routeid;
    @Column(nullable=false)
	private  String source;
    @Column(nullable=false)
	private String destination;
    @Column(nullable=false)
	private int distance;
    @Column(nullable=false)
	private String duration;
    @Column(nullable=false)
	private int costperkm;
  
  @Column(nullable=false)
  @OneToMany(mappedBy="route", cascade=CascadeType.ALL,fetch=FetchType.LAZY )
  private List<Ship> ships;

  
  
  
public int getRouteid() {
	return routeid;
}

public void setRouteid(int routeid) {
	this.routeid = routeid;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public int getDistance() {
	return distance;
}

public void setDistance(int distance) {
	this.distance = distance;
}

public String getDuration() {
	return duration;
}

public void setDuration(String duration) {
	this.duration = duration;
}

public int getCostperkm() {
	return costperkm;
}

public void setCostperkm(int costperkm) {
	this.costperkm = costperkm;
}

public List<Ship> getShips() {
	return ships;
}

public void setShips(List<Ship> ships) {
	this.ships = ships;
}

@Override
public String toString() {
	return "Route [routeid=" + routeid + ", source=" + source + ", destination=" + destination + ", distance="
			+ distance + ", duration=" + duration + ", costperkm=" + costperkm + ", ships=" + ships + ", getRouteid()="
			+ getRouteid() + ", getSource()=" + getSource() + ", getDestination()=" + getDestination()
			+ ", getDistance()=" + getDistance() + ", getDuration()=" + getDuration() + ", getCostperkm()="
			+ getCostperkm() + ", getShips()=" + getShips() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}
	

  
  
  
  
}
