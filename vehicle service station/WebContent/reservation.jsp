<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Reservation</title>
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="css/reservation.css">
</head>
<body>

<%
	String uid = (String) session.getAttribute("uid");
%>

    <div class="reservation-form" >
      <form action="AddReservationServlet" method="POST">

        <div class="form-group row">
          <label for="vehicle-number" class="col-sm-2 col-form-label">Vehicle number</label>
          <div class="col-sm-6">
            <input type="text" class="form-control form-control-lg" id="vehicle-number" name="vehicle-number" placeholder="vehicle number" required>
          </div>
        </div>

        <div class="form-group row">
          <label for="brand" class="col-sm-2 col-form-label">brand</label>
          <div class="col-sm-6">
            <input type="text" class="form-control form-control-lg" id="brand" name="brand" placeholder="vehicle brand" required>
          </div>
        </div>

        <div class="form-group row">
            <label for="vehicle model" class="col-sm-2 col-form-label">Vehicle Model</label>
            <div class="col-sm-6">
              <input type="text"  class="form-control form-control-lg" id="vehicle model" name="vehicle model" placeholder="vehicle model" required>
            </div>
        </div>

        <div class="form-group row">
            <label for="vehicle edition" class="col-sm-2 col-form-label">Vehicle Edition</label>
            <div class="col-sm-6">
              <input type="text" class="form-control form-control-lg" id="vehicle edition" name="vehicle edition" placeholder="vehicle edition" required>
            </div>
        </div>

        <div class="form-group row">
            <label for="body-type" class="col-sm-2 col-form-label body-type">Body Type</label>
            <select id="body-type" name="body-type" class="form-control form-control-lg col-sm-4"  required>
                <option value="SEDAN" >SEDAN</option>
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

        <div class="form-group row">
          <label for="transmission" class="col-sm-2 col-form-label transmission">Transmission</label>
          <select id="transmission" name = "transmission" class="form-control form-control-lg col-sm-4"  required>
              <option value="Auto" >Auto</option>
              <option value="Manual">Manual</option>
          </select>
        </div>


        <fieldset class="form-group">
          <div class="row">
            <legend class="col-form-label col-sm-2 pt-0">Fuel Type</legend>
            <div class="col-sm-10">

              <div class="form-check">
                <input class="form-check-input" type="radio" name="fuel" id="Petrol" value="Petrol" checked>
                <label class="form-check-label" for="Petrol">
                    Petrol
                </label>
              </div>

              <div class="form-check">
                <input class="form-check-input" type="radio" name="fuel" id="Diesel" value="Diesel">
                <label class="form-check-label" for="Diesel">
                    Diesel
                </label>
              </div>

              <div class="form-check disabled">
                <input class="form-check-input" type="radio" name="fuel" id="Electric" value="Electric" >
                <label class="form-check-label" for="Electric">
                    Electric
                </label>
              </div>

              <div class="form-check disabled">
                <input class="form-check-input" type="radio" name="fuel" id="Hybrid" value="Hybrid" >
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
              <input class="form-control form-control-lg" type="datetime-local" value="2011-08-19T13:45:00" id="date" name="date">
            </div>
          </div>
          
        <input type="hidden" name="userID" value="<%=uid %>" />

        <div class="form-group row">
          <div class="col-sm-6">
            <button type="submit" class="btn btn-outline-primary btn-lg">Make Reservation</button>
          </div>
        </div>
      </form>

    </div>
</body>
</html>