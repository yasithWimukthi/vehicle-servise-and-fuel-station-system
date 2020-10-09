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

import com.VehicleServiceStation.model.Reservation;

public interface iReservationService {

	/** INITIALIZE LOGGER*/
	public static final Logger logger = Logger.getLogger(iReservationService.class.getName());
	
	public ArrayList<Reservation> getReservationByUID(String uid);
	/**
	 * 
	 * @author YASITH WIMUKTHI
	 * IT 19966922
	 * 
	 * RETURN RESERVATION OBJECTS FOR GIVEN USER ID
	 * 
	 * @param uid
	 * 
	 * 
	 * @return ArrayList<Reservation>
	 */
	
	public Reservation getReservationByReservationID(String rid);
	/**
	 * 
	 * @author YASITH WIMUKTHI
	 * IT 19966922
	 * 
	 * RETURN RESERVATION OBJECT FOR GIVEN RESERVATION ID
	 * 
	 * @param rid
	 * 
	 * 
	 * @return Reservation OBJECT
	 */
}
