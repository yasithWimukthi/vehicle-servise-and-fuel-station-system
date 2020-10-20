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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.VehicleServiceStation.util.DBConnectionUtil;
import com.VehicleServiceStation.util.Query;
import com.VehicleServiceStation.util.QueryConstants;

public class EmployeeService implements iEmployeeService{
	
	/** INITIALIZING LOGGER **/
	public static final Logger logger = Logger.getLogger(EmployeeService.class.getName());
	
	/** REFERENCE FOR CONNECTION **/
	private static Connection conn;
	
	private PreparedStatement preparedStatement;
	
	
	/**
	 * 
	 * saveReservation METHOD STORES RESERVATION DETAILS INTO THE DATABASE
	 * 
	 * @author Yasith wimukthi
	 * IT19966922
	 * 
	 * @param vno,brand,model,edition,bodyTpye,transmission,date,fuelType,uid
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 * 
	 * @return RETURN TRUE IF SAVE DETAILS SUCCESSFULLY
	 * 
	 */
	@Override
	public boolean addEmployee(String fname, String lname, String email, String mobile, String dob, String age,
			String address, String type, String salary) {
		// TODO Auto-generated method stub
		try {
			
			conn = DBConnectionUtil.getConnection();
			
			String sql = Query.ADD_EMPLOYEE;
			
			preparedStatement = conn.prepareStatement(sql);
			
			preparedStatement.setString(QueryConstants.COLUMN_ONE, fname);
			preparedStatement.setString(QueryConstants.COLUMN_TWO, lname);
			preparedStatement.setString(QueryConstants.COLUMN_THREE, email);
			preparedStatement.setString(QueryConstants.COLUMN_FOUR, mobile);
			preparedStatement.setString(QueryConstants.COLUMN_FIVE, dob);
			preparedStatement.setString(QueryConstants.COLUMN_SIX, age);
			preparedStatement.setString(QueryConstants.COLUMN_SEVEN, address);
			preparedStatement.setString(QueryConstants.COLUMN_EIGTH, type);
			preparedStatement.setString(QueryConstants.COLUMN_NINE, salary);
			
			preparedStatement.execute();
		}
		
		catch (SQLException | ClassNotFoundException  e) {
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
