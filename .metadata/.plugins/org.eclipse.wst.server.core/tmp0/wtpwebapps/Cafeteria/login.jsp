<!DOCTYPE html>
<html lang="en">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login | Imbiss Cafe</title>
    <link rel="icon" href="./images/logo/mainlogo.png">
    <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&family=Montserrat:wght@400;800;900&family=Bubblegum+Sans&family=Mali&family=Flamenco&family=Aclonica&family=Carter+One&family=Luckiest+Guy&family=Lato&family=Montserrat+Subrayada&family=Sarabun&family=Viga&family=Wellfleet&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="./references/login.css">
    <link rel="stylesheet" href="./references/main.css">
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
	.fab{
		font-size:30px !important;
	}
</style>
<body>
	<% boolean logErr = request.getAttribute("logErr") != null; %>
    <!--Header-->
    <div class="header-container">
       <!--  <div class="image-container">
            <a href="./index.html"><img src="./images/logo/lph-logo-gray.png"></a>
        </div> -->
        <br>
        <section class="login-container" >
            <div class="login-left-panel" style="padding-bottom:1em;">
                <spr:form class="was-validated" action="validateUser.htm" method="post" commandName="user">
                    <h1 style="font-weight: 800 !important; font-size:30px !important; margin-top:1em;">Sign In</h1><br>
                    <div class="social-container">
                        <a href="#"><i class="fab fa-facebook"></i></a>
                        <a href="#">  <i class="fab fa-google-plus"></i></a>
                        <a href="#"> <i class="fab fa-twitter"></i></a>
                    </div><br>
                    <p style="font-size: 14px; color: #5a5a5a;">or use your email address</p>
                    <%if(logErr){ %>
                   	<div style="color:red; font-size:14px; margin: 0 10%; width:80%; font-family:'Montserrat'" class="">Email or Password did not match! Please try again.</div>
                   	<%} %>
                    <spr:input style="max-width: 20em; margin-left:2em" class="form-control form-group is-valid" minlength="10" required="true" id="validationServer03" type="email" path="userEmail" placeholder="Enter your Email"/> 
                    <div style="margin-top: -1em !important; margin-bottom:5px !important;" class="invalid-feedback">Enter valid Email Address.</div>
                    <input style="max-width: 20em; margin-left:2em" type="password" class="form-control is-valid" minlength="6" placeholder="Enter Password" name="userPass" required="true" /> 
                    <div style="margin-top: 0 !important;" class="invalid-feedback">Minimum password length should be 6.</div>
                    
                     <p><a href="forgotForm.htm" style="font-size: 14px; color: #252525; text-decoration: underline;">Forgot Pasword?</a></p>
                    <input type="submit" value="Login">
                </spr:form>
            </div>
            <div class="login-right-panel" style="padding-bottom:1em;">
                <form class="right-panel-content" action="regForm.htm" > 
                    <h1 style="font-weight: 800 !important; font-size:30px !important; margin-top:1em;">Hello, Friend!</h1><br><br>
                    <p>Not Already a User? Enter few details and start Journey with Us.</p><br><br>
                    <input type="submit" value="Sign Up"/>
                </form>
            </div>
        </section>

        
        
    </div>

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
            <span><a href="./regForm.htm">Register  <i class="fas fa-sign-in-alt"></i></a></span>
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