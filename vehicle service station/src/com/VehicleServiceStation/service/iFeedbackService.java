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

import java.util.ArrayList;
import java.util.logging.Logger;
import com.VehicleServiceStation.model.Feedback;

public interface iFeedbackService {
	
	// INITIALIZE LOGGER
	public static final Logger logger = Logger.getLogger(iFeedbackService.class.getName());
	
	public void saveFeedback(Feedback feedback);
	
	/**
	 * saveFeedback() method stores user feedbacks in the DB.
	 *
	 * @author Yasith wimukthi
	 * IT19966922 
	 * 
	 * @param feedback
	 */
	
	public ArrayList<Feedback> viewFeedback();
	
	/**
	 * viewFeedback() method retrieves user feedbacks from the DB.
	 *
	 * @author 
	 * IT 
	 * 
	 */
}
