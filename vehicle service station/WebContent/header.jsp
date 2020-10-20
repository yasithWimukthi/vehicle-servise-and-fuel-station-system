<!--
	VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM 
	H.R. Yasith wimukthi
 	IT19966922
 	Y2S1 2.2
    OOP
 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.VehicleServiceStation.model.User"%>
<%@page import="com.VehicleServiceStation.service.UserService"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title></title>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.13.1/css/all.css" integrity="sha384-xxzQGERXS00kBmZW/6qxqJPyxW3UR0BPsL4c8ILaIWXva5kFi7TxkIIaMiKtqV1Q" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link  rel="stylesheet" href="css/index.css">
</head>
<body>

<%
	UserService userService = new UserService();
	String uid = (String) session.getAttribute("uid");
	User user = userService.getUserByID(uid);
%>
		
	              <!--
                    NAV BAR
                -->
   <nav class="navbar navbar-expand-sm bg-dark navbar-dark " style="margin-bottom: 20px; height: 50px; font-size : 16px;">
        <div class="container">
            <a href="index.html" class="navbar-brand  ">GARAGE</a>
            <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a href="home.jsp" class="nav-link">Home</a>
                    </li>
                    <li class="nav-item">
                        <a href="#contactUs" class="nav-link">Contact Us</a>
                    </li>
                    <li class="nav-item">
                        <a href="reservation.jsp" class="nav-link">Reservation</a>
                    </li>
                    <li class="nav-item">
                        <a href="your-details.jsp" class="nav-link"><%=user.getFname() %></a>
                    </li>
                </ul>
            </div>
        </div>      
   </nav>

</body>
</html>