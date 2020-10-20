<!--
	VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM 
	H.R. Yasith wimukthi
 	IT19966922
 	Y2S1 2.2
    OOP
 -->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="css/employee-form.css">
	<title>Add Employee</title>
</head>
<body>

	    <form action="AddEmployeeServlet" method="POST">

          <div class="form-group row">
            <label for="fname" class="col-sm-2 col-form-label">First Name</label>
            <div class="col-sm-6">
              <input type="text" class="form-control " id="fname" name="fname" placeholder="First Name" required>
            </div>
          </div>

          <div class="form-group row">
            <label for="lname" class="col-sm-2 col-form-label">Last Name</label>
            <div class="col-sm-6">
              <input type="text" class="form-control " id="lname" name="lname" placeholder="Last Name" required>
            </div>
          </div>

          <div class="form-group row">
            <label for="email" class="col-sm-2 col-form-label">Email</label>
            <div class="col-sm-6">
              <input type="text" class="form-control " id="email" name="email" placeholder="Email" required>
            </div>
          </div>

          <div class="form-group row">
            <label for="mobile" class="col-sm-2 col-form-label">Phone No</label>
            <div class="col-sm-6">
              <input type="tel" class="form-control " id="mobile" name="mobile" placeholder="Phone No" required>
            </div>
          </div>
          
          <div class="form-group row">
            <label for="dob" class="col-sm-2 col-form-label">D.O.B.</label>
            <div class="col-sm-6">
              <input type="date" class="form-control " id="dob" name="dob" placeholder="Date Of Birth" required>
            </div>
          </div>

          <div class="form-group row">
            <label for="age" class="col-sm-2 col-form-label">Age</label>
            <div class="col-sm-6">
              <input type="text" class="form-control " id="age" name="age" placeholder="Age" required>
            </div>
          </div>
          
          <div class="form-group row">
            <label for="address" class="col-sm-2 col-form-label">Address</label>
            <div class="col-sm-6">
              <input type="text" class="form-control " id="address" name="address" placeholder="Address" required>
            </div>
          </div>
          
          <div class="form-group row">
            <label for="type" class="col-sm-2 col-form-label">Type</label>
            <div class="col-sm-6">
              <input type="text" class="form-control " id="type" name="type" placeholder="Type" required>
            </div>
          </div>

          <div class="form-group row">
            <label for="salary" class="col-sm-2 col-form-label">Salary</label>
            <div class="col-sm-6">
              <input type="text" class="form-control " id="salary" name="salary" placeholder="Salary" >
            </div>
          </div>

          <button type="submit" class="btn btn-outline-primary btn-lg">Submit</button>
    </form>

</body>
</html>