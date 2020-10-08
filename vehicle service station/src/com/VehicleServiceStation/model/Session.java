/**
 * VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM
 * @author yasith wimukthi
 * IT 19966922
 * 
 * Y2S1 2.2
 * OOP
 *
 */
package com.VehicleServiceStation.model;

public class Session {
	
	private String uid;
	private String fname;
	private String lname;
	private String day;
	private String time;
	
	// DEFAULT CONSTRUCTOR
	public Session() {
		super();
	}
	
	// OVERLOADED CONSTUCTOR FOR ALL PRIVATE ATTRIBUTES
	public Session(String uid, String fname, String lname, String day, String time) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.day = day;
		this.time = time;
	}

	// OVERLOADED CONSTUCTOR FOR PRIVATE ATTRIBUTES WITHOUT uid
	public Session(String fname, String lname, String day, String time) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.day = day;
		this.time = time;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	// OVERRIDE toString METHOD
	@Override
	public String toString() {
		return "Session [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", day=" + day + ", time=" + time
				+ "]";
	}
	
}
