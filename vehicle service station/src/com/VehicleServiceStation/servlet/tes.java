package com.VehicleServiceStation.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.VehicleServiceStation.util.DBConnectionUtil;

public class tes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "insert into userDetails(fname,lname,email,password,phoneNo) values ('asa','sasa','asa','sasa','sasa')" ;
		
		/** CREATE REFERENCE TO CONNECTION **/
		
		try {
			Connection conn = DBConnectionUtil.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.execute();
		}
		 catch (Exception e) {
			e.printStackTrace();
		}
	}

}
