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

public class Query {
	/**
	 * CONTAINS ALL SQL QUERIES
	 * 
	 * @author yasith wimukthi
	 * IT 19966922
	 */
	
	/**
	 * QUERIES FOR LOGIN
	 */
	
	public static final String LOGIN = "SELECT * FROM userDetails WHERE email = ? AND password = ? ;";
	
	public static final String LOGIN_BY_EMAIL = "SELECT * FROM userDetails WHERE email = ? ;" ;
	
	
	/**
	 * QUERIES FOR USER DETAILS MANIPULATION
	 */
	
	public static final String GET_USER_BY_ID = "SELECT * FROM userDetails WHERE userID = ? ;";
	
	/**
	 * QUERIES FOR RESERVATION DETAILS MANIPULATION
	 */
	
	public static final String GET_RESERVATION_BY_UID = "SELECT * FROM reservation WHERE userID = ? ;";
	
	public static final String GET_RESERVATION_BY_RESERVATION_ID = "SELECT * FROM reservation WHERE reservationID = ? ;";
	
	public static final String UPDATE_RESERVATION = "UPDATE reservation SET vehicleNo = ?, vihicle_brand = ?, vehicle_model = ?, edition = ?, transmission = ?, body_type = ?, date = ? ,fuel_type = ? WHERE reservationID = ? ; " ;
	
	public static final String DELETE_RESERVATION = "DELETE FROM reservation WHERE reservationID = ? ;" ;
	
}
