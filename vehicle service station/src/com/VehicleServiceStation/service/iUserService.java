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

import com.VehicleServiceStation.model.User;

public interface iUserService {
	
	/** INITIALIZE LOGGER*/
	public static final Logger logger = Logger.getLogger(iUserService.class.getName());
	
	/**
	 * getCurrentUser RETURNS CURRENT LOGGED USER
	 * 
	 * @param email
	 * @return User object
	 */
	public User getCurrentUser(String email);
	
	/**
	 * RETURN USER OBJECT FOR GIVEN USER ID
	 * 
	 * @param uid
	 * @return User object
	 */
	public User getUserByID(String uid);
}
