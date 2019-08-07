package com.mphasis.stormreaper.entities;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name="ShipAdmin")
@Table(name="ShipAdmin")
public class Admin {

  @Id
  private  int aid;
  @Column(nullable=false)
  private String adminname;
  @Column(nullable=false)
  private long adminpassword;


  
  public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAdminname() {
	return adminname;
}
public void setAdminname(String adminname) {
	this.adminname = adminname;
}
public long getAdminpassword() {
	return adminpassword;
}
public void setAdminpassword(long adminpassword) {
	this.adminpassword = adminpassword;
}
@Override
public String toString() {
	return "Admin [aid=" + aid + ", adminname=" + adminname + ", adminpassword=" + adminpassword + "]";
}
  
 
  
  
  
  
}
