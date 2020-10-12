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

public class FeedbackService implements iFeedbackService {
	
	/** INITIALIZING LOGGER **/
	public static final Logger logger = Logger.getLogger(FeedbackService.class.getName());
	
	/** REFERENCE FOR CONNECTION **/
	private static Connection conn;
	
	private PreparedStatement preparedStatement;


	/**
	 * 
	 * saveFeedback METHOD SAVE USER FEEDBACKS INTO THE DATABASE
	 * 
	 * @author Yasith wimukthi
	 * IT19966922
	 * 
	 * @param name,email,message
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 * 
	 * @return boolean
	 * 
	 */

	@Override
	public boolean saveFeedback(String name, String email, String message) {
		// TODO Auto-generated method stub
		
		try {
			conn = DBConnectionUtil.getConnection();
			
			String sql = Query.SAVE_FEEDBACK;
			
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(QueryConstants.COLUMN_ONE, name);
			preparedStatement.setString(QueryConstants.COLUMN_TWO, email);
			preparedStatement.setString(QueryConstants.COLUMN_THREE, message );
			
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
