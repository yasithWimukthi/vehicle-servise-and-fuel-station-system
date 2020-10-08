package com.VehicleServiceStation.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.VehicleServiceStation.util.DBConnectionUtil;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		
		PreparedStatement preparedStatement;
		
		try {
			conn = DBConnectionUtil.getConnection();
			 String sql = "insert into userDetails (fname,lname,email,password,phoneNo) values('yasith11','wimukthi','yasith1@gmail.com','yasith123','0714044488');";
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
