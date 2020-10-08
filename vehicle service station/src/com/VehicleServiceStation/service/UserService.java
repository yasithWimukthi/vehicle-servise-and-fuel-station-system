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
import java.util.logging.Level;
import java.util.logging.Logger;


import com.VehicleServiceStation.model.User;
import com.VehicleServiceStation.util.DBConnectionUtil;
import com.VehicleServiceStation.util.Query;
import com.VehicleServiceStation.util.QueryConstants;



public class UserService implements iUserService {
	
	/** INITIALIZING LOGGER **/
	public static final Logger logger = Logger.getLogger(UserService.class.getName());
	
	/** REFERENCE FOR CONNECTION **/
	private static Connection conn;
	
	private PreparedStatement preparedStatement;
	
	/**
	 * 
	 * getCurrentUser METHOD RETURNS OBJECT OF CURRENT USER
	 * 
	 * @author Yasith wimukthi
	 * IT19966922
	 * 
	 * @param email
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException e
	 * 
	 * @return user
	 * 
	 */
	@Override
	public User getCurrentUser(String email) {
		// TODO Auto-generated method stub
		
		// CREATE USER OBJECT WITH DEFAULT CONSTRUCTOR
		User currentUser = new User();
		
		try {
			conn = DBConnectionUtil.getConnection();
			
			String sql = Query.LOGIN_BY_EMAIL;
			
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(QueryConstants.COLUMN_ONE, email);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				currentUser.setFname(resultSet.getString("fname"));
				currentUser.setLname(resultSet.getString("lname"));
				currentUser.setEmail(resultSet.getString("email"));
				//currentUser.setPhoneNo(resultSet.getString("phoneNo"));
				currentUser.setUid(resultSet.getString("userID"));
				currentUser.setType(resultSet.getString("type"));
			}
			else {
				currentUser = null;
			}
			
			
			
		}catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage());
		}
		finally {
			
			//CLOSE CONNECTION
			DBConnectionUtil.closeConnection(preparedStatement, conn);
		}
		
		return currentUser;
	}
	
	
	/**
	 * 
	 * getUserByID METHOD RETURN USER OBJECT FOR GIVEN USER ID
	 * 
	 * @author Yasith wimukthi
	 * IT19966922
	 * 
	 * @param uid
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException e
	 * 
	 * @return user
	 * 
	 */

	@Override
	public User getUserByID(String uid) {
		// TODO Auto-generated method stub
		
		// CREATE USER OBJECT WITH DEFAULT CONSTRUCTOR
		User user = new User();
		
		
		try {
			conn = DBConnectionUtil.getConnection();
			
			String sql = Query.GET_USER_BY_ID;
			
			preparedStatement = conn.prepareStatement(sql);
			
			preparedStatement.setString(QueryConstants.COLUMN_ONE, uid);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				user.setFname(resultSet.getString("fname"));
				user.setLname(resultSet.getString("lname"));
				user.setEmail(resultSet.getString("email"));
				user.setPhoneNo(resultSet.getString("phoneNo"));
			}
			else {
				user = null;
			}
			
		}catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			logger.log(Level.SEVERE, e.getMessage());
		}
		finally {
			//CLOSE CONNECTION
			DBConnectionUtil.closeConnection(preparedStatement, conn);
		}
		
		return user;
	}
	
	
	
	
	

}
