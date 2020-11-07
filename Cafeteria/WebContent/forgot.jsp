<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password | Imbiss Cage</title>
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

<body>
    <!--Header-->
    <div class="header-container">
        <% String message = request.getAttribute("mailMessage")!=null ? (String)request.getAttribute("mailMessage") : "none"; %>
        <section class="login-container" style="margin-top: 2em;">
            
            <div class="login-right-panel">
                <form class="right-panel-content" action="loginForm.htm">
                  <h1 style="font-weight: 800 !important; font-size:30px !important; margin-top:1em;">Hello, Friend!</h1><br><br>
                    <p>Forgot your Password? We've got that covered! Enter your Email Address & we will fetch your account</p><br><br>
                    <input type="submit" value="Sign In Instead"/>
                </form>
            </div>
            <div class="login-left-panel">
                <form action="forgot_password.htm" class="was-validated" method="post">
                    <h1 style="font-weight: 800 !important; font-size:30px !important; margin-top:1em;">Forgot Password</h1><br>
                     <input style="max-width: 20em; margin-left:2em" class="form-control" minlength="10" required="true" id="validationServer03" type="email" name="userEmail" placeholder="Enter your Email" /> 
                    <div style=" margin-bottom:5px !important;" class="invalid-feedback">Enter a valid Email.</div>
                  
                    <input type="submit" value="Send Password">
                     <% if(message.equals("You are not Registered!")){ %>
                     <br><br>
                   <span style="color:red;">You are not Registered!</span>
                   <a href="regForm.htm">Register Now!</a>
                   <%} else if(message.equals("Check you email for Password!")){
                   %>
                   <br><br>
                   <span style="color:green;">Check you email for Password!</span>
                   <a href="loginForm.htm">Go to Login Page.</a>
                   <%} %>
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
            <span><a href="loginForm.htm">Sign in  <i class="fas fa-sign-in-alt"></i></a></span>
            <span><a href="index.jsp">HOME  <i class="fas fa-home"></i></a></span>
        </div>

        <div class="footer-right">
            <a href="#" target=_blank><i class="fab fa-twitter"></i></a>
            <a href="#" target=_blank><i class="fab fa-instagram"></i></a>
            <a href="#" target=_blank><i class="fab fa-facebook-f"></i></a>
        </div>
    </div>
    <div class="footer-copyright">
        <h6>FOR ENTERTAINMENT PURPOSES.</h6>
        <h6>&copy; 2020 Pratik Ghare & Pratik Mohite. All Rights Reserved.</h6>
    </div>
</footer>
</body>

</html>