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
	<title>Index</title>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.13.1/css/all.css" integrity="sha384-xxzQGERXS00kBmZW/6qxqJPyxW3UR0BPsL4c8ILaIWXva5kFi7TxkIIaMiKtqV1Q" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link  rel="stylesheet" href="css/index.css">
</head>
<body>
	
	              <!--
                    NAV BAR
                -->
   <nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
        <div class="container">
            <a href="index.html" class="navbar-brand  ">GARAGE</a>
            <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a href="#home-section" class="nav-link">Home</a>
                    </li>
                    <li class="nav-item">
                        <a href="#contactUs" class="nav-link">Contact Us</a>
                    </li>
                    <li class="nav-item">
                        <a href="feedback.jsp" class="nav-link">Feedback</a>
                    </li>
                    <li class="nav-item">
                        <a href="#signup" class="nav-link">Sign Up</a>
                    </li>
                </ul>
            </div>
        </div>      
   </nav>

                   <!--
                    BODY SECTION
                    -->
    <header id="home-section">
        <div class="dark-overlay">
           <div class="home-inner container">
               <div class="row">
                   <div class="col-lg-8 d-none d-lg-block">
                       <h1 class="display-4">
                            <strong>Services</strong> 
                       </h1>

                       <div class="d-flex">
                           <div class="p-4 align-self-start">
                               <i class="fas fa-check fa-2x"></i>
                           </div>
                           <div class="p-4 align-self-end">
                               Lorem ipsum dolor sit amet consectetur adipisicing elit.
                                Ad excepturi alias cupiditate harum odit quas!!!
                           </div>
                       </div>

                       <div class="d-flex">
                            <div class="p-4 align-self-start">
                                <i class="fas fa-check fa-2x"></i>
                            </div>
                            <div class="p-4 align-self-end">
                                Lorem ipsum dolor sit amet consectetur adipisicing elit.
                                Ad excepturi alias cupiditate harum odit quas!!!
                            </div>
                        </div>

                        <div class="d-flex">
                            <div class="p-4 align-self-start">
                                <i class="fas fa-check fa-2x"></i>
                            </div>
                            <div class="p-4 align-self-end">
                                Lorem ipsum dolor sit amet consectetur adipisicing elit.
                                 Ad excepturi alias cupiditate harum odit quas!!!
                            </div>
                        </div>

                   </div>

                   <div class="col-lg-4">
                       <div class="card bg-primary text-center card-form">
                            <div class="card-body">
                                <h3>Login</h3>
                                <p>Please enter your email and password </p>
                                <form action="LoginServlet" method="post">

                                    <div class="form-group">
                                        <input type="email" class="form-control form-control-lg" name="email" id="email" placeholder="Email">
                                    </div>

                                    <div class="form-group">
                                        <input type="password" class="form-control form-control-lg" name="password" id="password" placeholder="Password">
                                    </div>

                                    <input type="submit" value="Login" class="btn btn-outline-light btn-block">
                                </form>
                            </div>
                       </div>
                   </div>
               </div>
           </div> 
        </div>
    </header>

                    <!--
                    EXPLORE HEAD
                    -->
    <section id="explore-head-section">
        <div class="container">
            <div class="row">
                <div class="col text-center py-5">
                    <h1 class="display-4">Explore</h1>
                    <p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                         Aut nihil harum sunt quod voluptates corrupti.</p>
                    <a href="#" class="btn btn-outline-secondary">Find Out More</a>
                </div>
            </div>
        </div>
    </section>
	
	
</body>
</html>