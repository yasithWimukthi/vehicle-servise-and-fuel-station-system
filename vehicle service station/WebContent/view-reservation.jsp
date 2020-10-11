<!--
	VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM 
	H.R. Yasith wimukthi
 	IT19966922
 	Y2S1 2.2
    OOP
 -->


<%@page import="java.util.ArrayList"%>
<%@page import="com.VehicleServiceStation.model.Reservation"%>
<%@page import="com.VehicleServiceStation.service.ReservationService"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>reservation details</title>
 	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="css/main.css">
</head>
<body>

<%
	String uid = (String) session.getAttribute("uid");
	ReservationService rs = new ReservationService();
	ArrayList<Reservation> reservations = new ArrayList<>();
	reservations = rs.getReservationByUID(uid);
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
                        <a href="your-details.jsp" class="side-nav__link ">Your Details</a>
                    </li>
                </ul>

                <ul class="side-nav">
                    <li class="side-nav__item active">
                        <a href="#" class="side-nav__link">View Reservation</a>
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

                 <div class="reservation-details">
					
					<table class="table">
					
						<thead class="thead-dark">
					
							<tr>
								<th scope="col">Vehicle No</th>
								<th scope="col">Brand</th>
								<th scope="col">Edition</th>
								<th scope="col">Vehicle Model</th>
								<th scope="col">Body Type</th>
								<th scope="col">Fuel Type</th>
								<th scope="col">Transmission</th>
								<th scope="col">Date</th>
								<th scope="col">Update</th>
								<th scope="col">Cancel</th>
								
							</tr>
						</thead>
						
						<%
							for (Reservation reservation : reservations){
						%>
						<tbody>
							<tr>
								<td scope="row"> <%=reservation.getVehicleNo() %></td>
								<td > <%=reservation.getBrand() %></td>
								<td> <%=reservation.getEdition() %></td>
								<td> <%=reservation.getVehicleModel() %></td>
								<td> <%=reservation.getBodyType() %></td>
								<td> <%=reservation.getFuelType() %></td>
								<td> <%=reservation.getTransmission() %></td>
								<td> <%=reservation.getDate() %></td>
								<td>
									<form action="EditReservationServlet" method="POST">
										<input type="hidden" name="resID" value="<%=reservation.getReservationID() %>" />
										<input type="submit" value="Update" name="update-reservation-btn" id="update-reservation-btn" class="btn btn-outline-success" />
									</form>
								</td>
								
								<td>
									<form action="RemoveReservationServlet" method="POST">
										<input type="hidden" name="resID" value="<%=reservation.getReservationID() %>" />
										<input type="submit" value="Cancel" name="cancel-reservation-btn" id="cancel-reservation-btn" class="btn btn-outline-danger" />
									</form>
								</td>
							</tr>
						</tbody>	
							<%
								}
							%>
					</table>
					
					
                 </div>   

            </main>

        </div>
    </div>

</body>
</html>