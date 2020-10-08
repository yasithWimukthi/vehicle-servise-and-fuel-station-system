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


public interface iLoginDAO {
	/*
	 * INTERFACE FOR LoginDAO CLASS
	 */
	
	/** INITIALIZE LOGGER **/
	public static final Logger logger = Logger.getLogger(iLoginDAO.class.getName());
	
	public boolean validate(String email, String password);
	
	/**
	 * 
	 * @author YASITH WIMUKTHI
	 * IT 19966922
	 * 
	 * CHECK EMAIL AND PASSWORD AND VALIDATE LOGIN
	 * 
	 * @param userName
	 * @param password
	 * 
	 * @return true or false
	 */
}

