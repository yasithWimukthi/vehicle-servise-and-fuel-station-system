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

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.VehicleServiceStation.util.DBConnXML;
import com.VehicleServiceStation.util.DBConnectionUtil;
import com.VehicleServiceStation.util.Query;
import com.VehicleServiceStation.util.QueryConstants;





public class LoginDAO implements iLoginDAO {
	
	/** INITIALIZE LOGGER **/
	public static final Logger logger = Logger.getLogger(LoginDAO.class.getName());
	
	/** CREATE REFERENCE TO CONNECTION **/
	private static Connection conn;
	
	private PreparedStatement preparedStatement;
	
	/**
	 * VALIDATES USER LOGIN
	 * 
	 * @return true or false
	 * 
	 * @author YASITH WIMUKTHI
	 * IT 19966922
	 * 
	 * @param email,password
	 * 
	 * @throws SQLException
	 * @throws SAXException 
	 * @throws IOException 
	 * @throws ParserConfigurationException
	 * @throws ClassNotFoundException e
	 */

	@Override
	public boolean validate(String email, String password) {
		// TODO Auto-generated method stub
		//boolean isValide = true;
		
		try {
			
			conn = DBConnectionUtil.getConnection();
			
			String sql = Query.LOGIN ;
			
			preparedStatement = conn.prepareStatement(sql);
			
			//SET EMAIL AND PASSWORD
			preparedStatement.setString(QueryConstants.COLUMN_ONE, email);
			preparedStatement.setString(QueryConstants.COLUMN_TWO, password);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			//RETURN TRUE, IF resultSet HAS VALUE.
			
			if(resultSet.next())
			{
				return true;
			}
			
			
			
		}
		catch ( SQLException |  ClassNotFoundException e) {
			// TODO: handle exception
			logger.log(Level.SEVERE, e.getMessage());
		}
		finally {
			
			try {
				
					if(conn != null) {
						conn.close();
					}
					
					if(preparedStatement != null) {
						preparedStatement.close();
					}

			}catch (SQLException e) {
				logger.log(Level.SEVERE, e.getMessage());
			}
			
		}
		return false;
	}
	
	
}
