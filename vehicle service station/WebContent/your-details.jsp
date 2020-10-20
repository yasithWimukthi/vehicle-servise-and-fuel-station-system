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
	<title>Your Details</title>
  	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="css/main.css">
</head>
<body>

  <%
	UserService userService = new UserService();
	String uid = (String) session.getAttribute("uid");
	User user = userService.getUserByID(uid);
%> 

	<jsp:include page="header.jsp"></jsp:include>

    <div class="main-container">
        <header class="header">
            <form action="LogoutServlet" method="POST">
            	<button type="submit" class="btn btn-outline-danger logout-btn">Logout</button>
            </form>
        </header>

        <div class="content">

            <nav class="sidebar">

                <ul class="side-nav">
                    <li class="side-nav__item active">
                        <a href="#" class="side-nav__link ">Your Details</a>
                    </li>
                </ul>

                <ul class="side-nav">
                    <li class="side-nav__item">
                        <a href="view-reservation.jsp" class="side-nav__link">View Reservation</a>
                    </li>
                </ul>

                <ul class="side-nav">
                    <li class="side-nav__item">
                        <a href="#" class="side-nav__link">Update Reservation</a>
                    </li>
                </ul>

                <ul class="side-nav">
                    <li class="side-nav__item">
                        <a href="#" class="side-nav__link">Delete Reservation</a>
                    </li>
                </ul>
                
                <ul class="side-nav">
                    <li class="side-nav__item ">
                        <a href="#" class="side-nav__link">Update User</a>
                    </li>
                </ul>

            </nav>

            <main class="main-content">

                <div class="gallery">

                    <figrue class="gallery__item">
                        <img src="images/img1.jpg" alt="gallery-image" class="gallery-image">
                    </figrue>

                    <figrue class="gallery__item">
                        <img src="images/img2.jpg" alt="gallery-image" class="gallery-image">
                    </figrue>

                    <figrue class="gallery__item">
                        <img src="images/img3.jpg" alt="gallery-image" class="gallery-image">
                    </figrue>

                </div>

                 <div class="details">

                    <div class="alert alert-primary details-box" role="alert" style="font-size: 16px;">
                        First name : <%= user.getFname() %>
                    </div>

                    <div class="alert alert-primary details-box" role="alert" style="font-size: 16px;">
                        Last name : <%= user.getLname() %>
                    </div>

                    <div class="alert alert-primary details-box" role="alert" style="font-size: 16px;">
                        Email : <%= user.getEmail() %>
                    </div>

                    <div class="alert alert-primary details-box" role="alert" style="font-size: 16px;">
                        Mobile number : <%= user.getPhoneNo() %>
                    </div>


                 </div>  
                 
                 <div class="update-user" >
                     <a href="update-user.jsp" class="btn btn-outline-success btn-lg" style="margin-left: 350px;">Update details</a>
                 </div >

            </main>

        </div>
    </div>
    
     <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>