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


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.VehicleServiceStation.model.Reservation;
import com.VehicleServiceStation.util.DBConnectionUtil;
import com.VehicleServiceStation.util.Query;
import com.VehicleServiceStation.util.QueryConstants;

public class ReservationService implements iReservationService {
	
	/** INITIALIZING LOGGER **/
	public static final Logger logger = Logger.getLogger(ReservationService.class.getName());
	
	/** REFERENCE FOR CONNECTION **/
	private static Connection conn;
	
	private PreparedStatement preparedStatement;
	
	/**
	 * 
	 * getReservationByUID METHOD RETURNS RESERVATION OBJECTS FOR GIVEN USER ID
	 * 
	 * @author Yasith wimukthi
	 * IT19966922
	 * 
	 * @param uid
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 * 
	 * @return ArrayList<Reservation>
	 * 
	 */

	@Override
	public ArrayList<Reservation> getReservationByUID(String uid) {
		// TODO Auto-generated method stub
		ArrayList<Reservation> reservationList = new ArrayList<Reservation>();
		
		try {
			conn = DBConnectionUtil.getConnection();
			
			String sql = Query.GET_RESERVATION_BY_UID;
			
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(QueryConstants.COLUMN_ONE, uid);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				//CREATE RESERVATION OBJECT
				Reservation reservation = new Reservation();
				
				reservation.setBodyType(resultSet.getString("body_type"));
				reservation.setBrand(resultSet.getString("vihicle_brand"));
				reservation.setDate(resultSet.getString("date"));
				reservation.setEdition(resultSet.getString("edition"));
				reservation.setReservationID(resultSet.getString("reservationID"));
				reservation.setTransmission(resultSet.getString("transmission"));
				reservation.setVehicleModel(resultSet.getString("vehicle_model"));
				reservation.setVehicleNo(resultSet.getString("vehicleNo"));
				
				// ADD RESERVATION OBJECT INTO THE ARRAY LIST
				reservationList.add(reservation);
				
			}
			
		}
		catch (SQLException | ClassNotFoundException  e ) {
			// TODO: handle exception
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage());
		}
		finally {
			
			//CLOSE CONNECTION
			DBConnectionUtil.closeConnection(preparedStatement, conn);
		}
		
		
		return reservationList;
	}


	
	/**
	 * 
	 * getReservationByUID METHOD RETURNS RESERVATION OBJECTS FOR GIVEN USER ID
	 * 
	 * @author Yasith wimukthi
	 * IT19966922
	 * 
	 * @param uid
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 * 
	 * @return Reservation OBJECT
	 * 
	 */
	
	@Override
	public Reservation getReservationByReservationID(String rid) {
		// TODO Auto-generated method stub
		
		/** CREATE RESERVATION OBJECT*/
		Reservation reservation = new Reservation();
		
		try {
			
			conn = DBConnectionUtil.getConnection();
			
			String sql = Query.GET_RESERVATION_BY_RESERVATION_ID;
			
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(QueryConstants.COLUMN_ONE, rid);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				reservation.setReservationID(resultSet.getString("reservationID"));
				reservation.setBodyType(resultSet.getString("body_type"));
				reservation.setBrand(resultSet.getString("vihicle_brand"));
				reservation.setDate(resultSet.getString("date"));
				reservation.setEdition(resultSet.getString("edition"));
				reservation.setTransmission(resultSet.getString("transmission"));
				reservation.setVehicleModel(resultSet.getString("vehicle_model"));
				reservation.setVehicleNo(resultSet.getString("vehicleNo"));
			}
		}
		catch (SQLException | ClassNotFoundException  e ) {
			// TODO: handle exception
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage());
		}
		finally {
			//CLOSE CONNECTION
			DBConnectionUtil.closeConnection(preparedStatement, conn);
		}
		
		
		return reservation;
	}

	
	/**
	 * 
	 * updateReservation METHOD UPDATES RESERVATION OF GIVEN RESERVATION ID
	 * 
	 * @author Yasith wimukthi
	 * IT19966922
	 * 
	 * @param rid,vno,brand,model,edition,bodyTpye,transmission,date
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 * 
	 * @return RETURN TRUE IF UPDATE SUCCESSFULLY
	 * 
	 */

	@Override
	public boolean updateReservation(String rid, String vno, String brand, String model, String edition,
			String bodyTpye, String transmission, String date) {
		// TODO Auto-generated method stub
		
		try {
			
			conn = DBConnectionUtil.getConnection();
			
			String sql = Query.UPDATE_RESERVATION;
			
			preparedStatement = conn.prepareStatement(sql);
			
			preparedStatement.setString(QueryConstants.COLUMN_ONE,vno );
			preparedStatement.setString(QueryConstants.COLUMN_TWO, brand);
			preparedStatement.setString(QueryConstants.COLUMN_THREE, model);
			preparedStatement.setString(QueryConstants.COLUMN_FOUR, edition);
			preparedStatement.setString(QueryConstants.COLUMN_FIVE, transmission);
			preparedStatement.setString(QueryConstants.COLUMN_SIX, bodyTpye);
			preparedStatement.setString(QueryConstants.COLUMN_SEVEN, date);
			preparedStatement.setString(QueryConstants.COLUMN_EIGTH, "1");
			
			preparedStatement.execute();
			
			
		}
		catch (SQLException | ClassNotFoundException  e ) {
			// TODO: handle exception
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage());
			return false;
		}
		finally {
			//CLOSE CONNECTION
			DBConnectionUtil.closeConnection(preparedStatement, conn);
		}
		
		return true;
	}


}
