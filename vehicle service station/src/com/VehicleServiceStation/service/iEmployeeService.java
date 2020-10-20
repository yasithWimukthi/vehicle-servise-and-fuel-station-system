/**
 * VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM
 * @author yasith wimukthi
 * IT 19966922
 * 
 * Y2S1 2.2
 * OOP
 *
 */


package com.VehicleServiceStation.service;

import java.util.logging.Logger;

public interface iEmployeeService {

	/**
	 * INTERFACE FOR EmployeeService CLASS
	 */
	
	/** INITIALIZE LOGGER **/
	public static final Logger logger = Logger.getLogger(iEmployeeService.class.getName());
	
	/**
	 * 
	 * @author YASITH WIMUKTHI
	 * IT 19966922
	 * 
	 * ADD AN EMPLOYEE INTO THE DATABASE
	 * 
	 * @param fname,lname,email,mobile,dob,age,address,type,salary
	 * 
	 * 
	 * @return boolean
	 */
	public boolean addEmployee(String fname,String lname,String email,String mobile,String dob,String age,String address,String type,String salary);
}
