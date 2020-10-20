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
	<title>Update User Details</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
	<link  rel="stylesheet" href="css/main.css">
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
            <button type="button" class="btn btn-outline-danger logout-btn">Logout</button>
        </header>

        <div class="content">

            <nav class="sidebar">

                <ul class="side-nav">
                    <li class="side-nav__item ">
                        <a href="#" class="side-nav__link ">Your Details</a>
                    </li>
                </ul>

                <ul class="side-nav">
                    <li class="side-nav__item">
                        <a href="#" class="side-nav__link">View Reservation</a>
                    </li>
                </ul>

                <ul class="side-nav">
                    <li class="side-nav__item ">
                        <a href="#" class="side-nav__link">Update Reservation</a>
                    </li>
                </ul>

                <ul class="side-nav">
                    <li class="side-nav__item">
                        <a href="#" class="side-nav__link">Delete Reservation</a>
                    </li>
                </ul>

                <ul class="side-nav">
                    <li class="side-nav__item active">
                        <a href="#" class="side-nav__link">Update User</a>
                    </li>
                </ul>

            </nav>

            <main class="main-content">

                <div class="gallery">

                    <figrue class="gallery__item">
                        <img src="images/img1.jpg" alt="" class="gallery-image">
                    </figrue>

                    <figrue class="gallery__item">
                        <img src="images/img2.jpg" alt="" class="gallery-image">
                    </figrue>

                    <figrue class="gallery__item">
                        <img src="images/img3.jpg" alt="" class="gallery-image">
                    </figrue>

                </div>

                 <div class="update-reservation">

                    <form action="UpdateUserServlet" method="POST">

                        <div class="form-group row">
                          <label for="first-name" class="col-sm-2 col-form-label">First Name</label>
                          <div class="col-sm-6">
                            <input type="text" value="<%= user.getFname() %>" class="form-control form-control-lg" id="first-name" name="first-name" required>
                          </div>
                        </div>

                        <div class="form-group row">
                          <label for="last-name" class="col-sm-2 col-form-label">Last Name</label>
                          <div class="col-sm-6">
                            <input type="text" value="<%= user.getLname() %>" class="form-control form-control-lg" id="last-name" name="last-name" required>
                          </div>
                        </div>

                        <div class="form-group row">
                            <label for="email" class="col-sm-2 col-form-label">Email</label>
                            <div class="col-sm-6">
                              <input type="email" value="<%= user.getEmail() %>"  class="form-control form-control-lg" id="email" name="email" required>
                            </div>
                        </div>

                        <div class="form-group row">
                            <label for="phone" class="col-sm-2 col-form-label">Phone Number</label>
                            <div class="col-sm-6" >
                        	<input type="tel" value="<%= user.getPhoneNo() %>" class="form-control form-control-lg" id="phone" name="phone" required>
                            </div>
                        </div>
                        
                        <input type="hidden" name="userID" value="<%=uid %>" />

                        <div class="form-group row">
                          <div class="col-sm-6">
                            <button type="submit" class="btn btn-outline-success btn-lg">Update</button>
                          </div>
                        </div>
                      </form>
					</main>
                 </div>   
			</div>
			 <jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>