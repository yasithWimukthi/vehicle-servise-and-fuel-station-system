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
	
	public boolean updateReservation(String rid,String vno,String brand,String model,String edition,String bodyTpye,String transmission,String date,String fuelType);
	/**
	 * 
	 * @author YASITH WIMUKTHI
	 * IT 19966922
	 * 
	 * UPDATE RESERVATION OF GIVEN RESERVATION ID
	 * 
	 * @param rid,vno,brand,model,edition,bodyTpye,transmission,date,fuelType
	 * 
	 * 
	 * @return RETURN TRUE IF UPDATE SUCCESSFULLY
	 */
	
	public boolean deleteReservation(String rid);
	/**
	 * 
	 * @author YASITH WIMUKTHI
	 * IT 19966922
	 * 
	 * DELETE RESERVATION OF GIVEN RESERVATION ID
	 * 
	 * @param RESERVATION ID
	 * 
	 * 
	 * @return RETURN TRUE IF DELETE SUCCESSFULLY
	 */
}
