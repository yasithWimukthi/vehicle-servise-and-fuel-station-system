/**
 * VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM
 * @author yasith wimukthi
 * IT 19966922
 * 
 * Y2S1 2.2
 * OOP
 *
 */

/**
 * DBConnectionUtil CLASS CREATES THE DATABASE CONNECTION
 * 
 * @see DBconnProperty
 */

package com.VehicleServiceStation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.VehicleServiceStation.service.iFeedbackService;


public class DBConnectionUtil  {
	
	/**
	 * USED SIGLETON DESIGN PATTERN
	 */
	private static Connection conn;
	public static final Logger logger = Logger.getLogger(iFeedbackService.class.getName());
	
	private DBConnectionUtil() {
		
	}
	
	/**
	 * CREATE DATABASE CONNECTION
	 * 
	 * @return SQL CONNECTION FOR MICROSOFT SQL SERVER DATABASE
	 * @throws SQLExecption
	 * @throws ClassNotFoundException
	 */
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		/*
		 * CREATE NEW CONNECTION WHEN CONNECTION IS CLOSED OR NULL
		 */
		try {
			if( conn == null || conn.isClosed() )
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servicestation",
						"root",
						"root");
						
			}
		}
		catch (ClassNotFoundException  e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		return conn;
	}
	
	public static void closeConnection(PreparedStatement preparedStatement , Connection conn) {
		try {
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage());
		} 
	}

}
