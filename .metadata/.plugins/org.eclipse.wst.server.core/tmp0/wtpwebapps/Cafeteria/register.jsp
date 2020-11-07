<!DOCTYPE html>
<html lang="en">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<%@page import="com.cafe.dto.User" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register | Imbiss Cafe</title>
    <link rel="icon" href="./images/logo/mainlogo.png">
    <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&family=Montserrat:wght@400;800;900&family=Bubblegum+Sans&family=Mali&family=Flamenco&family=Aclonica&family=Carter+One&family=Luckiest+Guy&family=Lato&family=Montserrat+Subrayada&family=Sarabun&family=Viga&family=Wellfleet&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="./references/feedback.css">
    <link rel="stylesheet" href="./references/footer.css">
    <link rel="stylesheet" href="./references/navigationBar.css">
    <link rel="stylesheet" href="./references/animation.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
</head>
<style>
	.form-control{
		background: rgba(255, 255, 255, 0.4) !important;
    	//border: none !important;
    	//border: 1px solid #c0c0c0 !important;
    	//outline: none !important;
	}
	 form input{
	 	

	 }
</style>
<body>
	<!--NavigationBar-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top">

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link " href="./index.jsp">HOME</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./menu.jsp">VIEW OUR MENU</a>
                </li>
            </ul>

        </div>
    </nav>
    <!--EndofNavigationBar-->


    <!--Heading-->
    <div class="main-heading">
        <h1>Register</h1>
    </div>
    <!--EndofHeading-->

    <!--Form-->
    <div class="sub-part">
        <p>Help us know you better, so that we can serve you better. Information provided herein will be used solely for research purposes and will not be sold to any third parties.</p>
    </div>
    <section class="main-form">
        <spr:form action="regUser.htm" class="was-validated" method="post" commandName="user" >
            <div class="flex-container">
                <h5>Let us know you better*</h5><br>
                
                <spr:input path="userName" placeholder="Customer Name*" /><br>
               
                <input type="email" name="userEmail" class="form-control" placeholder="Enter your Email*" required="true" /><br>
                <spr:password class="form-control" minlength="6" required="true"  path="userPass" placeholder="Enter your Password*" />
                <br><br>
                <h5>Contact Details*</h5><br>
                <spr:input path="userPhone" placeholder="Mobile No.*" /><br>
                <select name="userCity" id="select-list" required>
                    <option value="-">-- Select your city</option>
                    <option value="Pune">Pune</option>
                    <option value="Mumbai">Mumbai</option>
                    <option value="Indore">Indore</option>
                    <option value="Sangli">Sangli</option>
                    <option value="Jaipur">Jaipur</option>
                    <option value="Ahemdabad">Ahemdabad</option>
                    <option value="Gujrat">Gujrat</option>
                    <option value="Ratlam">Ratlam</option>
                   	<option value="Hyderabad">Hyderabad</option>
                   	<option value="Chennai">Chennai</option>
                   	<option value="Agra">Agra</option>
                   	<option value="Raipur">Raipur</option>
                   	<option value="SriNagar">SriNagar</option>
                   	<option value="Amritsar">Amritsar</option>
                   	<option value="Lucknow">Lucknow</option>
                    <option value="Nashik">Nashik</option>
                    <option value="Nagpur">Nagpur</option>
                    <option value="Surat">Surat</option>
                    <option value="Kolkata">Kolkata</option>
                </select>
               <br><br>
                <button id="submit">Register</button>
            </div>
        </spr:form>
        <div class="right-panel">
            <img src="./images/history-culture/promote.png" />
            <!-- <img src="./images/history-culture/give-back.png" /> -->
            <img src="./images/history-culture/team.png" />
        </div>
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
            <span><a href="loginForm.htm">Sign in  <i class="fas fa-sign-in-alt"></i></a></span>
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
        <h6>&copy; 2020 Pratik Ghare & Pratik Mohite. All Rights Reserved.</h6>
    </div>
</footer>
<!--EndOfFooter-->
</body>

</html>