<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Change Password | Imbiss Cafe</title>
    <link rel="icon" href="./images/logo/mainlogo.png">
    <link href="https://fonts.googleapis.com/css2?family=Chelsea+Market&family=Montserrat:wght@400;800;900&family=Bubblegum+Sans&family=Mali&family=Flamenco&family=Aclonica&family=Carter+One&family=Luckiest+Guy&family=Lato&family=Montserrat+Subrayada&family=Sarabun&family=Viga&family=Wellfleet&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="./references/login.css">
    <link rel="stylesheet" href="./references/main.css">
    <link rel="stylesheet" href="./references/footer.css">
    <link rel="stylesheet" href="./references/navigationBar.css">
    <link rel="stylesheet" href="./references/animation.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
</head>

<body>
    <!--Header-->
    <div class="header-container">
        
        <section class="login-container" style="margin-top:2em;">
            
            <div class="login-right-panel">
                <form class="right-panel-content" action="loginForm.htm">
                    <h1>Hello, Friend!</h1><br><br>
                    <p>Forgot your Password? We've got that covered! Enter your Email Address & we will fetch your account</p><br><br>
                    <input type="submit" value="Sign In Instead"/>
                </form>
            </div>
            <div class="login-left-panel">
                <form action="changePass.htm" method="post">
                    <h1>Change Password</h1><br>
                    <input type="hidden" name="userEmail" placeholder="Enter Email-ID" value="<%= request.getAttribute("userEmail") %>"/> 
                    <% if(((String)request.getAttribute("PassNotMatch")) != null){ %>
                    	<span style="color:red">Passwords did not match! Please try again.</span>
                    <%} %>
                    <input type="password" name="userPass" placeholder="Enter Password"  required minlength="6"/> 
                    <input type="password" name="reUserPass" placeholder="Re-Enter Password"  required minlength="6"/>
                    <input style="margin-top:2em;" type="submit" value="Change Password">
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
<!--EndOfFooter-->
</body>

</html>