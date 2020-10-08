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

import com.VehicleServiceStation.model.User;

public interface iUserService {
	
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
