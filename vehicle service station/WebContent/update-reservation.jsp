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
	<title>Update Reservation</title>
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
	String bodyType = reservation.getVehicleModel();
	String transmission = reservation.getTransmission();
	String date = reservation.getDate();
	
%>
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

                    <form action="UpdateReservationServlet" method="POST">

                        <div class="form-group row">
                          <label for="vehicle-number" class="col-sm-2 col-form-label">Vehicle number</label>
                          <div class="col-sm-6">
                            <input type="text" class="form-control form-control-lg" value="<%=vehicleNumber %>" id="vehicle-number" name="vehicle-number" required>
                          </div>
                        </div>

                        <div class="form-group row">
                          <label for="brand" class="col-sm-2 col-form-label">brand</label>
                          <div class="col-sm-6">
                            <input type="text" class="form-control form-control-lg" value="<%=brand %>" id="brand" name="brand" required>
                          </div>
                        </div>

                        <div class="form-group row">
                            <label for="vehicle model" class="col-sm-2 col-form-label">Vehicle Model</label>
                            <div class="col-sm-6">
                              <input type="text" class="form-control form-control-lg" value="<%=vehicleModel %>" id="vehicle model" name="vehicle model" required>
                            </div>
                        </div>

                        <div class="form-group row">
                            <label for="vehicle edition" class="col-sm-2 col-form-label">Vehicle Edition</label>
                            <div class="col-sm-6">
                              <input type="text" class="form-control form-control-lg" value="<%=edition %>" id="vehicle edition" name="vehicle edition" required>
                            </div>
                        </div>

                        <div class="form-group row">
                            <label for="body-type" class="col-sm-2 col-form-label">Body Type</label>
                            <select id="body-type" class="form-control form-control-lg col-sm-4" name="body type" required>
                                <option value="SEDAN">SEDAN</option>
                                <option value="COUPE">COUPE</option>
                                <option value="SPORTS">SPORTS</option>
                                <option value="STATION WAGON">STATION WAGON</option>
                                <option value="HATCHBACK">HATCHBACK</option>
                                <option value="CONVERTIBLE">CONVERTIBLE</option>
                                <option value="SUV">SPORT-UTILITY VEHICLE (SUV)</option>
                                <option value="MINIVAN">MINIVAN</option>
                                <option value="OTHER">OTHER</option>
                            </select>
                        </div>

                        <fieldset class="form-group">
                          <div class="row">
                            <legend class="col-form-label col-sm-2 pt-0">Transmission</legend>
                            <div class="col-sm-10">

                              <div class="form-check">
                                <input class="form-check-input" type="radio" name="transmission" id="Petrol" value="Petrol" checked>
                                <label class="form-check-label" for="Petrol">
                                    Petrol
                                </label>
                              </div>

                              <div class="form-check">
                                <input class="form-check-input" type="radio" name="transmission" id="Diesel" value="Diesel">
                                <label class="form-check-label" for="Diesel">
                                    Diesel
                                </label>
                              </div>

                              <div class="form-check disabled">
                                <input class="form-check-input" type="radio" name="transmission" id="Electric" value="Electric" >
                                <label class="form-check-label" for="Electric">
                                    Electric
                                </label>
                              </div>

                              <div class="form-check disabled">
                                <input class="form-check-input" type="radio" name="transmission" id="Hybrid" value="Hybrid" >
                                <label class="form-check-label" for="Hybrid">
                                    Hybrid
                                </label>
                              </div>

                            </div>
                          </div>
                        </fieldset>

                        <div class="form-group row">
                            <label for="date" class="col-2 col-form-label">Date and time</label>
                            <div class="col-6">
                              <input class="form-control form-control-lg" type="datetime-local" value="<%=date %>"  id="date" name="date">
                            </div>
                          </div>
                          
                         <input type="hidden" name="resID" value="<%=reservationID %>" />

                        <div class="form-group row">
                          <div class="col-sm-6">
                            <button type="submit" class="btn btn-outline-success btn-lg">Update</button>
                          </div>
                        </div>
                      </form>


                 </div>   

            </main>

        </div>
    </div>
	
</body>
</html>