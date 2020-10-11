<!--
	VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM 
	H.R. Yasith wimukthi
 	IT19966922
 	Y2S1 2.2
    OOP
 -->

<%@page import="com.VehicleServiceStation.model.Reservation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Cancel Reservation</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
	<link  rel="stylesheet" href="css/main.css">
</head>
<body>

<%
	Reservation reservation = new Reservation();
	reservation = (Reservation)request.getAttribute("reservation");
	
	String reservationID = reservation.getReservationID();
	String vehicleNumber = reservation.getVehicleNo();
	String brand = reservation.getBrand();
	String edition = reservation.getEdition();
	String vehicleModel = reservation.getVehicleModel();
	String bodyType = reservation.getBodyType();
	String transmission = reservation.getTransmission();
	String date = reservation.getDate();
	String fuelType = reservation.getFuelType();
	
%>

	    <div class="main-container">
        <header class="header">
            <form action="LogoutServlet" method="POST">
            	<button type="submit" class="btn btn-outline-danger logout-btn">Logout</button>
            </form>
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
                    <li class="side-nav__item active">
                        <a href="#" class="side-nav__link">Update Reservation</a>
                    </li>
                </ul>

                <ul class="side-nav">
                    <li class="side-nav__item">
                        <a href="#" class="side-nav__link">Delete Reservation</a>
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

                    <form action="CancelReservationServlet" method="POST">

                        <div class="form-group row">
                          <label for="vehicle-number" class="col-sm-2 col-form-label">Vehicle number</label>
                          <div class="col-sm-6">
                            <input type="text" class="form-control form-control-lg" value="<%=vehicleNumber %>" id="vehicle-number" name="vehicle-number" readonly="readonly">
                          </div>
                        </div>

                        <div class="form-group row">
                          <label for="brand" class="col-sm-2 col-form-label">brand</label>
                          <div class="col-sm-6">
                            <input type="text" class="form-control form-control-lg" value="<%=brand %>" id="brand" name="brand" readonly="readonly">
                          </div>
                        </div>

                        <div class="form-group row">
                            <label for="vehicle model" class="col-sm-2 col-form-label">Vehicle Model</label>
                            <div class="col-sm-6">
                              <input type="text" class="form-control form-control-lg" value="<%=vehicleModel %>" id="vehicle model" name="vehicle model" readonly="readonly">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label for="vehicle edition" class="col-sm-2 col-form-label">Vehicle Edition</label>
                            <div class="col-sm-6">
                              <input type="text" class="form-control form-control-lg" value="<%=edition %>" id="vehicle edition" name="vehicle edition" readonly="readonly">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label for="body type" class="col-sm-2 col-form-label">Body Type</label>
                            <div class="col-sm-6">
                              <input type="text" class="form-control form-control-lg" value="<%=bodyType %>" id="body type" name="body type" readonly="readonly">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label for="transmission" class="col-sm-2 col-form-label">Transmission</label>
                            <div class="col-sm-6">
                              <input type="text" class="form-control form-control-lg" value="<%=transmission %>" id="transmission" name="transmission" readonly="readonly">
                            </div>
                        </div>
                        
                        <div class="form-group row">
                            <label for="Fuel" class="col-sm-2 col-form-label">Fuel Type</label>
                            <div class="col-sm-6">
                              <input type="text" class="form-control form-control-lg" value="<%=fuelType %>" id="Fuel" name="Fuel" readonly="readonly">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label for="date" class="col-2 col-form-label">Date and time</label>
                            <div class="col-6">
                              <input class="form-control form-control-lg" type="text" value="<%=date %>"  id="date" name="date" readonly="readonly">
                            </div>
                          </div>
                          
                         <input type="hidden" name="resID" value="<%=reservationID %>" />

                        <div class="form-group row">
                          <div class="col-sm-6">
                            <button type="submit" class="btn btn-outline-danger btn-lg">Cancel Reservation</button>
                          </div>
                        </div>
                      </form>

                 </div>   

            </main>

        </div>
    </div>
</body>
</html>