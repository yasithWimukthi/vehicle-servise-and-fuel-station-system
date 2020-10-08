/**
 * VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM
 * @author yasith wimukthi
 * IT 19966922
 * 
 * Y2S1 2.2
 * OOP
 *
 */

package com.VehicleServiceStation.util;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.VehicleServiceStation.service.iFeedbackService;





public class DBConnProperty {
	/*
	 * THIS CLASS LOADS ALL PROPERTY DETAILS OF DATABASE CONNECTION
	 * WHEN INITIALIZING
	 */
	
	/** INITIALIZE LOGGER **/
	public static final Logger logger = Logger.getLogger(iFeedbackService.class.getName());
	
	/** CREATE A PROPERTY VARIABLE  **/
	public static final Properties properties = new Properties();
	
	static {
		
		try 
		{
			/** Read the property when load the class **/
			properties.load(DBConnXML.class.getResourceAsStream(QueryConstants.DB_PROPERTY));
			
		} catch (IOException e) {
			
		    logger.log(Level.SEVERE, e.getMessage());
			
		}
	}
	
	
}
