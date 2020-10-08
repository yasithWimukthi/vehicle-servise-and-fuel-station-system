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

public class User {
	
	private String uid;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String phoneNo;
	private String type;

	/*
	 * CREATE DEFAULT CONSTRUCTOR
	 */
	
	public User() {
		super();
	}
	
	
	/*
	 * CREATE OVERLOADED CONSTRUCTOR WITH ALL FIELDS
	 */
	
	public User(String uid, String fname, String lname, String email, String password, String phoneNo, String type) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
		this.type = type;
	}


	/*
	 * CREATE OVERLOADED CONSTRUCTOR WITHOUT TYPE FIELD
	 */

	public User(String uid, String fname, String lname, String email, String password, String phoneNo) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
	}
	
	/*
	 * CREATE OVERLOADED CONSTRUCTOR WITHOUT UID FIELDS
	 */

	public User(String fname, String lname, String email, String password, String phoneNo) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	/*
	 * CONVERT USER DETAILS TO STRING
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User : userID : " + this.uid +
				" First name : " + this.fname +
				" Last name : " + this.lname +
				"Phone no : " +this.phoneNo +
				"Email : " +this.email +".";
				
	}
	
	
}
