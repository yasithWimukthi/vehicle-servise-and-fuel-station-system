
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
	<title>Feedback</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
	<link  rel="stylesheet" href="css/feedback.css">
</head>
<body>

    <div class="feedback-container">

        <div class="primary-header">
            <p>Feedback</p>
        </div>

        <div class="primary-text">
            <p>Should  you have face any issue feel free to contact us. We will get back to you as soon as we can! </p> 
        </div>

        <form action="SaveFeedbackServlet" method="POST">
            <input type="text" name="name" placeholder="Name" required>

            <input type="email" name="email" placeholder="Email" required>

            <p>Message Should not exceed 500 words.</p>

            <textarea name="message" rows="10" cols="30"  required>
                
            </textarea>

            <input type="submit" value="Submit" class="btn btn-outline-info submit-btn">
        </form>


    </div>
    
</body>
</html>