<!--
	VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM 
	H.R. Yasith wimukthi
 	IT19966922
 	Y2S1 2.2
    OOP
 -->

<%@page import="com.VehicleServiceStation.model.User"%>
<%@page import="com.VehicleServiceStation.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<%
	UserService userService = new UserService();
	String uid = (String) session.getAttribute("uid");
	User user = userService.getUserByID(uid);
%>

	<jsp:include page="header.jsp"></jsp:include>
	
	
</body>
</html>