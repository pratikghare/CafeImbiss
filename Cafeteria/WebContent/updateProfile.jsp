<!DOCTYPE html>
<html lang="en">
<%@page import="com.cafe.dto.User" %>
<%@taglib prefix="spr" uri="http://www.springframework.org/tags/form" %>
<%@page import="com.cafe.dto.User" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Account | Imbiss Cafe</title>
    <link rel="icon" href="./images/logo/mainlogo.png">
    <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&family=Montserrat:wght@400;800;900&family=Bubblegum+Sans&family=Mali&family=Flamenco&family=Aclonica&family=Carter+One&family=Luckiest+Guy&family=Lato&family=Montserrat+Subrayada&family=Sarabun&family=Viga&family=Wellfleet&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="./references/feedback.css">
    <link rel="stylesheet" href="./references/footer.css">
    <link rel="stylesheet" href="./references/navigationBar.css">
    <link rel="stylesheet" href="./references/animation.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
</head>
<style>
	.profile-upload{
		display: grid;
		grid-template-columns: 1fr 4fr 1fr;
	}
	.profile-upload > *{
		justify-self: center;
		margin: 1em 0;
		grid-column: 2;
		max-width: 20em !important;
	}	
</style>
<body>
<% String profile = ((User)session.getAttribute("user")).getProfilePic(); %>
    <!--NavigationBar-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-secondary sticky-top">

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item mb-2 mt-1">
                    <a class="nav-link " href="index.jsp">HOME</a>
                </li>
                <li class="nav-item mb-2 mt-1" >
                    <a class="nav-link" href="menu.jsp">VIEW OUR MENU</a>
                </li>
             
            </ul>
			 <% if(session.getAttribute("user") != null){ %>
			<div class="dropdown ml-auto mr-5">
			  <button style="font-family: 'Chelsea Market'"  class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			    <%= session.getAttribute("user") != null ? ((User)session.getAttribute("user")).getUserName():"Hello" %>
			  </button>
			  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
			    <a style="font-family: 'Montserrat'; font-size:15px" class="dropdown-item" href="account.htm">Manage Account</a>
			    <a style="font-family: 'Montserrat'; font-size:15px" class="dropdown-item" href="getCart.htm">Cart</a>
			    <div class="dropdown-divider"></div>
          		<a style="font-family: 'Montserrat'; font-size:15px" class="dropdown-item" href="logout.htm">Logout</a>
			  </div>
			</div>
			<% }else{%>
			<div class="ml-auto mr-5">
		<!-- 	<a href="loginForm.htm" class="btn btn-outline-secondary">Login</a> -->
				<a class="btn btn-outline-light" style="font-family: 'Chelsea Market'" href="loginForm.htm" role="button">Login</a> 
			</div>
			<%} %>
        </div>
    </nav>
    <!--EndofNavigationBar-->

    <!--Heading-->
    <% String name = session.getAttribute("user") != null ? ((User)session.getAttribute("user")).getUserName():"User"; %>
    <div class="main-heading">
    
        <h1>Change Profile Picture</h1>
    </div>
    <!--EndofHeading-->

    <!--Form-->
    <section class="main-form">
       	<form action="upload_file.htm" method="post" enctype="multipart/form-data" >
            <div class="profile-upload">
      		<img src="<%= "images/"+profile %>" height="250px">
    		<input style="max-width: 20em !important; margin-left:-1em;" type="file" name="file">
               <br><br>
                
                <button style="margin: 0 1em 0 0" id="submit" class="bg-success btn">Upload</button>
         
            </div>
        </form>
    </section>
    <!--EndOfForm-->

   <!--Footer-->
   <footer>
    <div class="footer">
        <div class="footer-left">
            <ul>
                <li>
                    <a href="#">Gift Card</a>
                </li>
                <li>
                    <a href="#">Contact Us</a>
                </li>
                <li>
                    <a href="https://www.amc.com/privacy" target="_blank">Privacy Policy</a>
                </li>
                <li>
                    <a href="https://www.amc.com/terms" target="_blank">Terms and Conditions</a>
                </li>
            </ul>
         
            <span><a href="./index.jsp">HOME  <i class="fas fa-home"></i></a></span>
        </div>

        <div class="footer-right">
            <a href="https://twitter.com/pratikghare888" target=_blank><i class="fab fa-twitter"></i></a>
            <a href="https://www.instagram.com/pratikghare_/" target=_blank><i class="fab fa-instagram"></i></a>
            <a href="https://www.facebook.com/pratikghare88" target=_blank><i class="fab fa-facebook-f"></i></a>
        </div>
    </div>
    <div class="footer-copyright">
        <h6>FOR ENTERTAINMENT PURPOSES.</h6>
        <h6>&copy; Pratik Ghare & Pratik Mohite. All Rights Reserved.</h6>
    </div>
</footer>
<!--EndOfFooter-->
</body>

</html>