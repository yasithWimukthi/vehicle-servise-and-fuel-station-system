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

public class Employee extends User{
	
	private String type;
	private double salary;
	private String dob;
	private String address;
	private int age;
	
	/**OVERLOADED CONSTRUCTOR WITH ALL FIELDS*/
	public Employee(String uid, String fname, String lname, String email, String password, String phoneNo, String type,
			String roll, double salary, String dob, String address, int age) {
		super(uid, fname, lname, email, password, phoneNo, type);
		this.type = roll;
		this.salary = salary;
		this.dob = dob;
		this.address = address;
		this.age = age;
	}
	

	/**OVERLOADED CONSTRUCTOR WITHOUT USERID FIELDS*/
	public Employee(String fname, String lname, String email, String password, String phoneNo, String roll,
			double salary, String dob, String address, int age) {
		super(fname, lname, email, password, phoneNo);
		this.type = roll;
		this.salary = salary;
		this.dob = dob;
		this.address = address;
		this.age = age;
	}
	
	
	public String getRoll() {
		return type;
	}

	public void setRoll(String roll) {
		this.type = roll;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	/**OVERRIDE toString METHOD*/
	@Override
	public String toString() {
		return "Employee [roll=" + type + ", salary=" + salary + ", dob=" + dob + ", address=" + address + ", age="
				+ age + "]";
	}



	
	
}
